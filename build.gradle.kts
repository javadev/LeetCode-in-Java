plugins {
    id("java")
    `maven-publish`
    jacoco
    id("org.sonarqube") version "4.3.0.3225"
    id("com.diffplug.spotless") version "6.12.0"
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:[5.9.3,)")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:[5.9.3,)")
    testImplementation("org.hamcrest:hamcrest-core:[2.2,)")
    testImplementation("org.zapodot:embedded-db-junit-jupiter:[2.1.1,)")
}

tasks.test {
    useJUnitPlatform()
    maxParallelForks = Runtime.getRuntime().availableProcessors()
}

group = "com.github.javadev"
version = "1.22-SNAPSHOT"
description = "leetcode-in-java"
java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

spotless {
    java {
        encoding("UTF-8")
        target("**/src/**/*.java")
        targetExclude("**/build/**")
        importOrder("\\#", "", "*")
        removeUnusedImports()
        googleJavaFormat("1.15.0").aosp()
        toggleOffOn()
        endWithNewline()
    }
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)
        html.required.set(false)
    }
}
