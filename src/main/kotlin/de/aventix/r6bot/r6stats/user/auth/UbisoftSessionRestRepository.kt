package de.aventix.r6bot.r6stats.user.auth

import feign.*
import feign.jackson.JacksonDecoder
import feign.jackson.JacksonEncoder
import feign.okhttp.OkHttpClient
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

interface UbisoftSessionRestRepository {
    @RequestLine("POST /profiles/sessions")
    @Headers(
        "Authorization: Basic {auth}",
        "Ubi-AppId: e3d5ea9e-50bd-43b7-88bf-39794f4e3d40",
        "Content-Type: application/json"
    )
    fun authenticate(@Param("auth") auth: String): UbisoftAuthenticationRestDTO

    companion object Factory {
        private val objectMapper = jacksonObjectMapper()
        fun create(): UbisoftSessionRestRepository = Feign.builder()
            .encoder(JacksonEncoder(objectMapper))
            .decoder(JacksonDecoder(objectMapper))
            .client(OkHttpClient())
            .target(
                UbisoftSessionRestRepository::class.java,
                "https://public-ubiservices.ubi.com/v3"
            )
    }
}