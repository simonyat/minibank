plugins {
    id("org.sdmtr.mini.bank.java-application-conventions")
    id("org.springframework.boot") version "3.1.3"
    id("io.spring.dependency-management") version "1.1.3"
}

dependencies {
    implementation(project(":mb-common"))

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

application {
    mainClass.set("org.sdmtr.mini.bank.client.MiniBankClientApplication")
}
