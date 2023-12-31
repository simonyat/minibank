plugins {
    id("org.sdmtr.mini.bank.java-common-conventions")
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

dependencies {
    implementation("org.mapstruct:mapstruct:1.5.5.Final")

    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.5.Final")
}