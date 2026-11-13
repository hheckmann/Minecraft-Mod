pluginManagement {
	repositories {
		maven("https://maven.fabricmc.net/");
		mavenCentral()
		gradlePluginPortal()
	}

	plugins {
		id("fabric-loom") version "1.7.4"
	}
}

// Should match your modid
rootProject.name = "fat-cats"
