package de.aventix.r6bot.r6stats.user.auth

import com.fasterxml.jackson.annotation.JsonProperty
import de.aventix.r6bot.r6stats.platform.Platform
import java.util.Date

data class UbisoftAuthenticationRestDTO(
    @JsonProperty("platformType")
    val platform: Platform,
    val ticket: String,
    val twoFactorAuthenticationTicket: String?,
    val profileId: String,
    val userId: String,
    val nameOnPlatform: String,
    val environment: String,
    val expiration: Date,
    val spaceId: String,
    val clientIp: String,
    val clientIpCountry: String,
    val serverTime: Date,
    val sessionId: String,
    val sessionKey: String,
    val rememberMeTicket: String?
)