# TextToWhatsapp Library
TextToWhatsapp is an Android Kotlin library that enables users to send messages to WhatsApp without the need to save the recipient's number. This library is designed to make it seamless for developers to integrate WhatsApp messaging functionality into their Android applications.

Getting Started
Step 1: Add Repository
Add the following lines to your root build.gradle file at the end of the repositories: \n
version :``` 1.0.0```
``` allproject
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
       maven ( url ="https://jitpack.io")
    }
}
```
Step 2: Add Dependency
Add the following dependency to your app module's build.gradle file:
```gradle
dependencies {

    implementation ("com.github.yusufkhan08070817:TextToWhatsaap:Tag")

```
}
Replace 'Tag' with the specific release tag you want to use.

How to Use
Initialize the TextToWhatsapp instance:
```  
val wp= TextToWhatsApp("countrycode+XXXXXXXXXX",this)
```
for example +91XXXXXXXXXX
Send a message:
```
wp.sentMsg()
```

That's it! You can now seamlessly integrate WhatsApp messaging into your Android Kotlin application.

License
This project is licensed under the MIT License.

Contribution
Contributions are welcome! Feel free to open issues or submit pull requests.
