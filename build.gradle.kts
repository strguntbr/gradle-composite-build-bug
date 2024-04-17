group = "at.ctrlbreak"
version = "1.0"

plugins {
    id("java-library")
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("at.ctrlbreak:library1:1.0")
}

configurations.all {
    resolutionStrategy {
        useGlobalDependencySubstitutionRules = false
        activateDependencyLocking()
    }
}
