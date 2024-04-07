package de.aventix.r6bot.r6stats.user

import com.fasterxml.jackson.annotation.JsonProperty
import de.aventix.r6bot.r6stats.platform.Platform

data class UbisoftUserRestDTO(
    val profileId: String,
    val userId: String,
    @JsonProperty("platformType")
    val platform: Platform,
    val idOnPlatform: String,
    val nameOnPlatform: String
)

class UbisoftUserProfilesRestDTO(
    val profiles: Array<UbisoftUserRestDTO>
)