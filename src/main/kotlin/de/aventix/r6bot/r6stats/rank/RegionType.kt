package de.aventix.r6bot.r6stats.rank

import com.fasterxml.jackson.annotation.JsonProperty

enum class RegionType(regionId: String) {
    @JsonProperty("emea")
    EUROPE("emea"),

    @JsonProperty("ncsa")
    AMERICA("ncsa"),

    @JsonProperty("apac")
    ASIA("apac")
}