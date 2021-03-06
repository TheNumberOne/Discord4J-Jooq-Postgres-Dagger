plugins {
    java
    kotlin("jvm") version "1.4.21"
}

group = "numeral"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.discord4j:discord4j-core:3.1.3")
    testImplementation("junit", "junit", "4.12")
}
