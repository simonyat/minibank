plugins {
    id("org.sdmtr.mini.bank.java-library-conventions")
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.22")

    compileOnly("org.projectlombok:lombok:1.18.22")
    annotationProcessor("org.projectlombok:lombok:1.18.22")
}