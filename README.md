# Scala workshop exercises

This repository contains a set of exercises used in a Scala intro workshop.

## Setting up the development environment

To use IntelliJ IDEA to work with the exercises, follow these steps:

* Install IntelliJ with the Scala plugin
  * http://scala-lang.org/documentation/getting-started-intellij-track/getting-started-with-scala-in-intellij.html
* Import the project into IntelliJ
  * Clone this repository if you haven't already
  * At IntelliJ startup screen, select `Import Project`, then select the
    `scala-workshop/build.gradle` file (not the directory)
  * In the import dialog, just click OK (the default settings are fine)

Or, just use Gradle (provided) with your favourite editor.

## The exercises

The goal of the exercises is to make the tests pass, typically by replacing
a specific value, `__` or `???` with the correct value or implementation.

To run the tests in IntelliJ, either 
* Open the file containing the tests, open the `Run` menu and select
  `Run`, or press `Ctrl+Shift+F10` / `Ctrl+Shift+R`
* Right click on the file containing the tests and select
  `Run Exercise...` from the context menu

If you are using Gradle on the command line, you can run the tests using:

```
./gradlew test
```
