plugins {
    kotlin("jvm") version "1.6.0"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "io.github.blugon09"
version = "1.0.0-SNAPSHOT"


java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}


repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.0")
}



tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
    }

    shadowJar {
        from(sourceSets["main"].output)
        archiveBaseName.set(project.name)
        archiveVersion.set("${project.version}")
        archiveFileName.set("${project.name}.jar")

        doLast {
            copy {
                from(archiveFile)
                val plugins = File("C:/Users/blugo/Desktop")
                into(plugins)
            }
        }

        manifest {
            attributes["Main-Class"] = "아이오.깃허브.블루곤09.한글코틀린.한글코틀린"
        }
    }
}