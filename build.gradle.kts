plugins {
    kotlin("jvm") version "1.8.21"
    application
}

group = "com.silpala.conferences.agileAndBeyond2023"
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

application {
    mainClass.set("MainKt")
}