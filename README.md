# TextToWhatsapp Library
TextToWhatsapp is an Android Kotlin library that enables users to send messages to WhatsApp without the need to save the recipient's number. This library is designed to make it seamless for developers to integrate WhatsApp messaging functionality into their Android applications.

Getting Started
Step 1: Add Repository
Add the following lines to your root build.gradle file at the end of the repositories:
``` allproject
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
Step 2: Add Dependency
Add the following dependency to your app module's build.gradle file:
```gradle
dependencies {
    implementation 'com.github.yusufkhan08070817:TextToWhatsaap:Tag'
}
```
