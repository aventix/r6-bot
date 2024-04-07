plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "de.aventix"
version = "1.0-SNAPSHOT"

application {
    mainClass = "de.aventix.r6bot.DiscordBotApplication"
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = application.mainClass
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.inject", "guice","latest.integration")
    implementation("net.dv8tion", "JDA", "latest.integration")
    implementation("io.github.openfeign", "feign-kotlin", "latest.integration")
    implementation("io.github.openfeign", "feign-okhttp", "latest.integration")
    implementation("io.github.openfeign", "feign-jackson", "latest.integration")
    implementation("com.fasterxml.jackson.module", "jackson-module-kotlin")
}

kotlin {
    jvmToolchain(21)
}