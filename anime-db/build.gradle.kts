plugins {
    kotlin("jvm")
    id("maven-publish")
    id("java-library")
}

group = "com.lagradost"
version = "1.0.2"

publishing {
    repositories {
        mavenLocal()
    }
    publications {
        create<MavenPublication>("jitpack") {
            groupId = "com.github.recloudstream"
            artifactId = "animedb"
            version = "1.0.2"
            from(components["java"])
        }
        create<MavenPublication>("maven") {
            groupId = "com.lagradost"
            artifactId = "animedb"
            version = "1.0.2"
            from(components["java"])
        }
    }
}



repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}
