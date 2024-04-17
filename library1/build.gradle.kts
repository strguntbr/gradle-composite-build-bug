plugins {
    id("java-library")
    id("maven-publish")
}

group = "at.ctrlbreak"
version = "1.0"

repositories {
    mavenCentral()
    mavenLocal()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
