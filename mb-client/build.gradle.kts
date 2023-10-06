plugins {
    id("org.sdmtr.mini.bank.java-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":mb-common"))
}

application {
//    mainClass.set("org.sdmtr.mini.bank.app.App")
}
