### Necessary tools for the project:

* Java Development Kit (version 1.8)
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html;
* IntelliJ IDEA
https://www.jetbrains.com/idea/download/;
* Latest version of Google Chrome 
http://chromedriver.chromium.org/downloads and unzip it to project folder
* Download chromedriver from http://chromedriver.chromium.org/downloads and unzip it to project folder
* Put in pom.xml import for selenium java from https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59
* Download and install git from https://gitforwindows.org/
* Put in pom.xml import for test tool "testng" from https://mvnrepository.com/artifact/org.testng/testng
* Add DataProvider from https://www.mkyong.com/unittest/testng-parameter-testing-example/
* Add to pom.xml import from https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.8.1

---
Also, need to configure IntelliJ IDEA:
* Download and add chromedriver and configure its Path in project
* Add selenium dependency into POM.xml

http://coddism.com/zametki/razmetka_readmemd_v_github

***Structure of project***

Project consist of following:
1. BasePage class - page is used to be extended for all other pages. 
2. LandingPage class - start page for google.com
3. SearchPage class - page with methods used to test search results
4. BaseTest class - contains before and after methods.
5. SearchTest - test scenario execution
