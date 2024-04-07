package de.aventix.r6bot.r6stats.user

import com.google.inject.Inject
import com.google.inject.Singleton
import de.aventix.r6bot.r6stats.user.auth.UbisoftAuthenticationRestDTO

@Singleton
class UbisoftUserService @Inject constructor(
    private val ubisoftUserRestRepository: UbisoftUserRestRepository,
) {
    private val currentAuthentication: UbisoftAuthenticationRestDTO? = null;
}