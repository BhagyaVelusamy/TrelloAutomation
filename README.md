# TrelloAutomation
UI Automation of Trello web site using Core Java,TestNg and Selenium webdriver

Automation done:

1. Login into Trello
2. create a new board
3. Create a list and name it as List A and create another list and name it as List B
4. Add a card in listA and move  it to list B.
5. Get the x and y coordinated of the card that you moved
6. Log out

These operations are carried out as 3 important events which has been defined in(src/main/java/com.Trello.PageEvents)
1. Events associated with Login (LoginPage.java)
2. Events associated with the dashboard (Dashboardpage.java)
3. Events associated with the board (BoardPage.java)

All the webelements related to each of these events are placed under the following respositories as interface files(src/main/java/com.Trello.PageObjects)
1.LoginPageElements.java - web elements present in login screen
2.DashboardPageElements.java - web elements present in dashboard screen
3.BoardPageElements.java - web elements present in the board screen

The driver configuration has been done in "BasicConfiguration.java" file for different browsers uisng WebDriverManager.
"SampleTest.java" file has the test methods that are run using TestNg.xml configuration file.

Utilities:

1. "application.properties" file  has been used to handle commonly used sensitive data that can be accessed with the help of the class file "PropertiesFile.java"
2. "Listener.java" has been used to get the test results using TestNg framework and the failed test cases can be rerun using the IRetryAnalyser
3. "ElementsFetch.java" is used to aid capturing webelements easily
4.  "ScreenshotCapture.java" has defined methods that are not yet utilized in this framework.

Dependencies & Plugins used:
Maven, testNG, Seleniumm Webdriver,WebDriverManager,apache commons io.

testng.xml - configuration:

1. Some of the important parameters which  are dynamic in nature are handled in the configuration file like browser, browserVersion and the URL/resources
2. With this cross browser testing is also possible
3. SampleTest.java class file has the test method that is used to run the automation script using TestNG annotations.







