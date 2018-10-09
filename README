# Introduction

This project is about a small Maven project with Selenium and TestNG embedded to make it easy to get started UX/UI testing.

This project takes google search page for example to provide complete framework to start a web application UX/UI testing, 

### To install the archetype in your local repo:

git clone https://github.com/GitHub/googletest
cd googletest
mvn install
Now, you can use the archetype in a new project typing:

mvn archetype:generate -DgroupId=com.sylviayu -DartifactId=googletest -DarchetypeArtifactId=maven-archetype-quickstart
where please replace com.sylviayu to your group id of the project you are creating; 
replace googletest to your artifact id of the project you are creating.

It uses Java bindings for Selenium version 2.47.1 and TestNG version 6.9.6

### Project Structure:
- The project follows the standard Maven structure, so all the tests go in the src/test/java folder. Tests should inherit from the TCBase class;
- TCBase Class defines two methods - before test and after test, which follow TestNG methods and create test report result. 
- All properties in pages are defined in one Json file(assets\\page_properties.json), loaded and readed in Util Class,which will map to PageProperties Class;
- Page objects will be defined on com.sylviayu.pages package, WebPage is a basic class, where some basic methods are defined to find and actions on web elements and PageFactory will init web elements and webDriver when loading pages.
- All other pages will inherit Webpage class which make most of methods reused.

WebPage class (in src/main/java/pages) provides MAX 30 seconds as time out for polling element from the DOM (implicity wait), and provide 5 seconds as interal for polling element from DOM (explicity wait).

### Running the tests

testNG-smoke.xml(src/test/java) will be used to group and run test case, under project folder/test-output/index.xml is test result report.

### Adding Chrome Driver to the project

If you need to use chromedriver, you should put the proper driver file downloaded from https://sites.google.com/a/chromium.org/chromedriver/downloads. If you are on Windows, the file should be named chromedriver.exe.


### TestNG

For more info around TestNG framework, go to http://testng.org/doc/index.html. If you prefer, you could substitute this framework with JUnit.
