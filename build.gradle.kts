plugins {
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.depman)
    java
    checkstyle
}

group = "com.betanunes.vinylshelf"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(libs.spring.boot.web)
    testImplementation(libs.spring.boot.test)
}

checkstyle {
    configFile = file("checkstyle/checkstyle.xml")
}

//test {
//    useJUnitPlatform()
//}