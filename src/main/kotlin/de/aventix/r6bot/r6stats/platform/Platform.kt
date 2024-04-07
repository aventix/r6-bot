package de.aventix.r6bot.r6stats.platform

import com.fasterxml.jackson.annotation.JsonProperty

enum class Platform(
    val platformFamily: PlatformFamily,
    val sandboxId: String,
    val spaceId: String,
    val serverId: String
) {
    @JsonProperty("uplay")
    UPLAY(PlatformFamily.PC, "", "", ""),

    @JsonProperty("xbl")
    XBL(PlatformFamily.CONSOLE, "", "", ""),

    @JsonProperty("psn")
    PSN(PlatformFamily.CONSOLE, "", "", "");
}