buildscript {
    repositories {
        google()
        mavenCentral()
    }
    // Top-level build file where you can add configuration options common to all sub-projects/modules.
    dependencies {
        classpath(ClassPath.gradlePlugin)
        classpath(ClassPath.kotlinPlugins)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}