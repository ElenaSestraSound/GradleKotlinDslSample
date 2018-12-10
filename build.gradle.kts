buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.2.1")
        classpath( "org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.61")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.create("clean", Delete::class.java) { delete(rootProject.buildDir) }
