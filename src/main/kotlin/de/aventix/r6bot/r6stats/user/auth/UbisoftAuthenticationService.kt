package de.aventix.r6bot.r6stats.user.auth

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.*
import java.util.function.Supplier

@Singleton
class UbisoftAuthenticationService @Inject constructor(
    private val sessionRestRepository: UbisoftSessionRestRepository
) {
    private var currentAuthentication: Optional<UbisoftAuthenticationRestDTO> = Optional.empty()
    private val email = ""
    private val password = ""

    fun findCredentials(): Optional<UbisoftAuthenticationRestDTO> {
        this.currentAuthentication = this.currentAuthentication
            .flatMap {
                if (Date().time < it.expiration.time) {
                    Optional.of(it)
                } else {
                    Optional.empty<UbisoftAuthenticationRestDTO>()
                }
            }
            .or {
                try {
                    Optional.of(
                        this.sessionRestRepository
                            .authenticate(Base64.getEncoder().encodeToString("$email:$password".toByteArray()))
                    )
                } catch (error: Exception) {
                    Optional.empty<UbisoftAuthenticationRestDTO>()
                }
            }
        return this.currentAuthentication
    }
}