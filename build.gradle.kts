plugins {
    
    //id("org.jetbrains.kotlin.jvm") version "1.4.20"
    kotlin("multiplatform") version "1.4.20"
    //application
}

/*
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(14))
    }
}*/

repositories {
    jcenter()
}

dependencies {
    //implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
//    implementation("com.google.guava:guava:28.1-jre")

    // Use the Kotlin JDK 8 standard library.
    //implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

//    testImplementation("org.jetbrains.kotlin:kotlin-test")
//    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

//application {
//    mainClassName = "hu.advent.of.code.ApplicationKt"
//}

kotlin {
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    nativeTarget.apply {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }
    sourceSets {
        val nativeMain by getting
        val nativeTest by getting
    }
}
