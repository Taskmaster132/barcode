// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
	val compose_version by extra("1.0.0-rc01")
	val hilt_version by extra("2.37")
	val kotlin_version by extra("1.5.10")

	repositories {
		google()
		mavenCentral()
	}

	dependencies {
		classpath("com.android.tools.build:gradle:7.0.0-beta05")
		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
		classpath("com.google.dagger:hilt-android-gradle-plugin:$hilt_version")
	}
}

tasks.register("clean", Delete::class) {
	delete(rootProject.buildDir)
}
