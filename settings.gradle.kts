dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("com.fasterxml.jackson.core:jackson-databind:2.17.0")
    }
}

rootProject.name = "test"