# Testing of a music store webshop

## Introduction

This project contains set of test for testing web shop. This project was made for the purpose of project assignment for 
the Methods and Techniques of Software Testing course at the Faculty of Electrical Engineering, Computer Science and Information Technology Osijek.
This repository is used in educational purpuses only.

It uses next libraries:

* [TestNG](https://testng.org/doc/) - testing framework inspired by JUnit and NUnit
* [Selenium](https://selenium.dev/) - free autmated testing suite

## Set up
### 1. Installing Intellij

To start your project first you will have to download [Intellij IDEA](https://www.jetbrains.com/idea/) wich is integrated development environment.
This IDEA has it's community version, but students and professors can use it's ultimate version for free. After instalation you'll have to set it up.
It's up to you how do you want your environment to look.

### 2. Downloading JDK and adding it into Path

Firstly you'll have to [download SDK](https://jdk.java.net/13/). Secondly you need to extract the .zip archive somwhere on your PC. Now you need to add JDK to the PATH variable.
To add JDK to the Path variable follow this steps:
1. Open This PC
2. Right click somhere inside that window and click on Properties
3. In a new windows click on Advance system settings and a new window will pop up.
4. In advanced tab click on Environment Variables button.
5. In System variables sub window find variable with name Path.
6. Click on the Path variable. when it's highlighted press the button Edit...
7. In a new window press the button Browse and find the bin folder of downloaded JDK( eg. C:\Program Files\Java\jdk-12.0.2\bin).
8. When the bin directory is selected press OK. 
9. In some cases you'll have to reboot your PC.

To check if JDK is added to Path variable open CMD and type 

"java -version" command. If everithing is right you'll get the message "java version "12.0.2" 2019-07-16 

Java(TM) SE Runtime Environment (build 12.0.2+10) 

Java HotSpot(TM) 64-Bit Server VM (build 12.0.2+10, mixed mode, sharing)"

Now Intellij IDEA will automaticcaly recognize JDK. You can always download different versions and manually add it to Intellij.

### 3. Downloading Maven and adding it into Path

[Download Maven](https://maven.apache.org/download.cgi) Binary zip archive and unpack it somwhere on your PC. To add Maven to Path follow steps in the previous section. In step 7 you will now find bin directory of unpacked Maven file.

Now go to CMD and type in "mvn -version" command. If everthing is allright you'll get message 

"Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)

Maven home: D:\apache-maven-3.6.3\bin\..

Java version: 12.0.2, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-12.0.2 

Default locale: en_GB, platform encoding: Cp1252 

OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"  "


## Creating Maven Project

Now you will have to make a Maven project.

* Run Intellij IDEA 
* Click Create New Project
* Click on Maven on the left hand side. If you followed everything so far Intellij should recognize JDK  automatically. If your JDK is selceted press Next. If not you'll have to click on New... button right to the Project SDK lable. Now find and select bin directory of your JDK and press OK. After that click Next
* Insert Group Id. It can be whatever you want. Same for the Artifact Id.
* Click on Next and afther that on Finish

Your project is now created. 

In the bottom next corner you will see a pop up window. You should click on Enable Auto Import.

## Adding dependecies to pom.xml

When your project is done setting up expand project package and open pom.xml file.

To ad dependecies youll have to write <dependecies> </dependecies> . All dependecies must be located between those two statements.

### 1. Adding Selenium dependecy

To add [Selenium dependecy](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java) visit the site and pick a version of dependency. Then copy and add the lines in pom.xml of your project.
