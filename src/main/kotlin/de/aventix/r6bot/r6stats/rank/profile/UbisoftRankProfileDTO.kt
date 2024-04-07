package de.aventix.r6bot.r6stats.rank.profile

import com.fasterxml.jackson.annotation.JsonProperty
import de.aventix.r6bot.r6stats.platform.PlatformFamily
import de.aventix.r6bot.r6stats.rank.BoardType
import de.aventix.r6bot.r6stats.rank.UbisoftRank
import de.aventix.r6bot.r6stats.rank.season.UbisoftSeasonStatisticsDTO
import java.util.*

data class UbisoftRankProfileDTO(
    @JsonProperty("board_id")
    val boardId: BoardType,
    @JsonProperty("id")
    val userId: String,
    @JsonProperty("max_rank")
    val maxRank: UbisoftRank,
    @JsonProperty("max_rank_points")
    val maxRankPoints: Int,
    @JsonProperty("platform_family")
    val platformFamily: PlatformFamily,
    @JsonProperty("rank")
    val currentRank: UbisoftRank,
    @JsonProperty("rank_points")
    val currentRankPoints: Int,
    @JsonProperty("season_id")
    val seasonId: Int,
    @JsonProperty("top_rank_position")
    val topRankPosition: Int,
)

data class UbisoftRankProfileWrapperDTO(
    val profile: UbisoftRankProfileDTO,
    @JsonProperty("season_statistics")
    val seasonStatistics: UbisoftSeasonStatisticsDTO
)