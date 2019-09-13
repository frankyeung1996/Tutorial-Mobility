# Tutorial Mobility

Just for self learning and reference

Useful Link:
1. Kotlin (https://developer.android.com/kotlin)

Android and IOS

Native Approach:

1. Android
- programming language: Java or Kotlin
- IDE: Android Studio
- installable: apk

2. IOS
- programming language: Objective C or Swift
- IDE: xCode
- installable: ipa

> Challenge
  > time to market very high and costly
  > advantage: 100% device feature access, look and feel(UI) and graphics

3. Cross/ Hybrid (common language and IDE, apps can created for Android and IOS)

a. Cordova Phonegap(wrapper tool)
- programming language: HTML, CSS and Javascript
- IDE: eclipse
- installable: apk or ipa

b. Xamarin
- programming language: C#
- IDE: Visual studio

3. Mobile web approach:
- HTML5, CSS3, JS, JQuery, ......


Android Architecture


Android Platform:

      Key apps
          Calculator, Contacts....
      Middleware
          a. Application Framework(inbuilt API's written in java)
              NotificationManager, SMSManager, NetworkManager.......
          b. Native Libraries (written in C)
              SQLite, Webkit, FreeType, OpenGL.......
          c. ART
              provides runtime environment for the apps 
      OS(contains drivers which interacts with device hardware Camera driver, Keypad driver, .....)


Android Building Blocks

- Activity

- Services

- Content Provider

- Broadcast Receiver


Execution:

    1. compiler (compiles al the .kt files to .class files)
    2. dexer(dx) (converts all .class files to a single .dex file)
    3. ART(.dex + Resources + AndroidManifest.xml) ->> .apk
    

1 screen = 1 Activity(.java or .kt) + 1 layout(.xml)

  layout acts as a container for placing the UI elements
  a. LinearLayout
  b. TableLayout
  c. ConstraintLayout
  
UI elements or Views or Widgers:

  Button
  Checkbox
  RadioButton
  TextView
  EditText
  ListView
  RecyclerView........
