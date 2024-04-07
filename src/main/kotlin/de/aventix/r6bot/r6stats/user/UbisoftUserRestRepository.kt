package de.aventix.r6bot.r6stats.user

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import de.aventix.r6bot.r6stats.platform.Platform
import feign.Feign
import feign.Headers
import feign.Param
import feign.RequestLine
import feign.jackson.JacksonDecoder
import feign.jackson.JacksonEncoder
import feign.okhttp.OkHttpClient

interface UbisoftUserRestRepository {
    @RequestLine("GET /profiles?namesOnPlatform={username}&platformType={platform}")
    @Headers(
        "Authorization: ubi_v1 t={authtoken}",
        "Ubi-AppId: e3d5ea9e-50bd-43b7-88bf-39794f4e3d40",
        "Content-Type: application/json"
    )
    fun getUserByName(
        @Param("authtoken") authtoken: String,
        @Param("username") username: String,
        @Param("platform") platform: Platform
    ): UbisoftUserProfilesRestDTO


    @RequestLine("GET /profiles/{userId}")
    @Headers(
        "Authorization: ubi_v1 t={authtoken}",
        "Ubi-AppId: e3d5ea9e-50bd-43b7-88bf-39794f4e3d40",
        "Content-Type: application/json"
    )
    fun getUserById(
        @Param("authtoken") authtoken: String,
        @Param("userId") userId: String
    ): UbisoftUserRestDTO

    companion object Factory {
        private val objectMapper = jacksonObjectMapper();
        fun create(): UbisoftUserRestRepository = Feign.builder()
            .encoder(JacksonEncoder(objectMapper))
            .decoder(JacksonDecoder(objectMapper))
            .client(OkHttpClient())
            .target(UbisoftUserRestRepository::class.java, "https://public-ubiservices.ubi.com/v3")
    }
}
