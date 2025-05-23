import com.fasterxml.jackson.databind.ObjectMapper

plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
tasks.register("objectMapperFindModules") {
    onlyIf {
        ObjectMapper.findModules()
        return@onlyIf true
    }
}

tasks.register("objectMapperFindModulesSuccess") {
    doFirst {
        ObjectMapper.findModules()
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}