# Shoe Store Inventory App

This is the 1st project for Udacity Android Kotlin Developer Nanodegree Program. 

It is a part of Course 1: Developing Android Apps with Kotlin - Part 1

Project rubric is [here! ](https://review.udacity.com/#!/rubrics/2849/view)

## Project Steps

1. Open the starter project from the github repo in Android Studio
2. Add the navigation libraries to the app build.gradle file
3. Add the safe-arg plugin to the main and app build.gradle file
4. Set DataBindingUtil in build.gradle
5. Use DataBindingUtil to inflate every layout
6. Create a new navigation xml file
7. Create a new Login destination.
* Include email and password labels
* Include email and password fields
* Create buttons for creating a new login and logging in with an existing account
* Clicking either button should navigate to the Welcome Screen.
8. Create a new Welcome screen destination that includes:
* A new layout
* At least 2 textviews and use any text you would like
* A navigation button with actions to navigate to the instructions screen
9. Create a new Instruction destination that includes:
* A new layout
* At least 2 textviews with appropriate information
* A navigation button with actions to navigate to the shoe list screen
10. Create a class that extends ViewModel
* Use a LiveData field that returns the list of shoes
11. Create a new Shoe List destination that includes:
* A new layout
* A ScrollView
* A LinearLayout inside the ScrollView for Shoe Items
* A FloatingActionButton with an action to navigate to the shoe detail screen
12. In MainActivity, setup the nav controller with the toolbar and an AppBarConfiguration
13. In MainActivity, add a Logout menu to return to the login screen
14. Create a new Shoe Detail destination that includes:

* A new layout
* A TextView label and EditView for the Shoe Name, Company, Shoe Size and Description
* A Cancel button with an action to navigate back to the shoe list screen
* A Save button with an action to navigate back to the shoe list screen and add a new Shoe to the Shoe View Model.
* Hint: In the Shoe List destination, to add a child view programmatically to a ViewGroup, such as LinearLayout, use the addView() method.

15. Make sure you can’t go back to onboarding screens In the Shoe List screen:
* Use an Activity level ViewModel to hold a list of Shoes (use by activityViewModels)
* Observe the shoes variable from the ViewModel
* Add a new layout item into the scrollview for each shoe.

### Dependencies

    def nav_version = "2.3.2"
    def lifecycle_version = "2.2.0"
    
    implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    implementation 'androidx.core:core-ktx:1.3.2'
    implementation 'androidx.appcompat:appcompat:1.2.0'
    implementation 'com.google.android.material:material:1.2.1'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'

    // Kotlin navigation dependencies
    implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
    implementation "androidx.navigation:navigation-ui-ktx:$nav_version"
    // ViewModel
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    // LiveData
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
    //RecyclerView
    implementation 'androidx.recyclerview:recyclerview:1.1.0'

    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
