package de.aventix.r6bot.r6stats.rank.season

import com.fasterxml.jackson.annotation.JsonProperty

data class UbisoftSeasonStatisticsDTO(
    val deaths: Int,
    val kills: Int,
    @JsonProperty("match_outcomes")
    val matchStatistics: UbisoftSeasonMatchStatisticsDTO
)