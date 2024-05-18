plugins {
    kotlin("jvm") version "1.9.24"
    id("org.jetbrains.kotlinx.kover") version "0.8.0"
}

group = "org.example.e3fxgaming"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}