package de.aventix.r6bot.r6stats.user

import com.fasterxml.jackson.annotation.JsonProperty
import de.aventix.r6bot.r6stats.rank.profile.UbisoftRankProfileWrapperDTO

data class UbisoftUserRankProfileDTO(
    @JsonProperty("")
    val profiles: Array<UbisoftRankProfileWrapperDTO>
)