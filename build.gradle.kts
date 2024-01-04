plugins {
    kotlin("jvm") version "1.9.21"
    id("org.jetbrains.dokka") version "1.9.10"
}

group = "org.atech"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
subprojects {
    apply(plugin = "org.jetbrains.dokka")
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}