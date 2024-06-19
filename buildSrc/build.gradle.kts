import org.gradle.kotlin.dsl.kotlinDsl
import org.gradle.kotlin.dsl.repositories
import org.gradle.kotlin.dsl.plugins
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.google
import org.gradle.kotlin.dsl.mavenCentral

plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}
