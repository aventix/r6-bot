package de.aventix.r6bot

import de.aventix.r6bot.r6stats.platform.Platform
import de.aventix.r6bot.r6stats.user.auth.UbisoftAuthenticationRestDTO
import de.aventix.r6bot.r6stats.user.auth.UbisoftSessionRestRepository
import de.aventix.r6bot.r6stats.user.UbisoftUserRestRepository
import java.util.*

// TODO: make guice staff
// TODO: configuration staff
// TODO: best credentials finder
// TODO: Implement rank stuff
// TODO: Implement discord jda
// TODO: make git stuff

fun main() {
    val email = "calumwilson2000@gmail.com"
    val password = "Trivium19-"
    val email2 = "melvinschneider02+bot@gmail.com"
    val password2 = "dbvdLzZHZP+{b(2_"

    val authenticationTicket: UbisoftAuthenticationRestDTO = UbisoftSessionRestRepository.Factory.create()
        .authenticate(Base64.getEncoder().encodeToString("$email2:$password2".toByteArray()));

    /*println(
        UbisoftUserRestRepository.Factory.create()
            .getUserByName(authenticationTicket.ticket, "Aventix.NXZ", Platform.UPLAY).profiles.get(0).profileId
    )*/

    println(
        UbisoftUserRestRepository.Factory.create()
            .getUserByName(authenticationTicket.ticket, "Arrain", Platform.UPLAY).profiles.get(0).profileId
    )
}