$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/openURL.feature");
formatter.feature({
  "name": "Opening the Browser",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Open URL",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the Webdriver",
  "keyword": "Given "
});
formatter.match({
  "location": "Files.MyStepdefs.openTheWebdriver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter The  URL",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.enterTheURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page is Loaded",
  "keyword": "When "
});
formatter.match({
  "location": "Files.MyStepdefs.pageIsLoaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the URL",
  "keyword": "And "
});
formatter.match({
  "location": "Files.MyStepdefs.checkTheURL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Upcoming Bikes",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The page",
  "keyword": "Given "
});
formatter.match({
  "location": "Files.MyStepdefs.thePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move to new Bike",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.moveToNewBike()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the Upcoming bikes from the list",
  "keyword": "And "
});
formatter.match({
  "location": "Files.MyStepdefs.clickOnTheUpcomingBikesFromTheList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select The manufacturer as honda",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.selectTheManufacturerAsHonda()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Results are displayed",
  "keyword": "When "
});
formatter.match({
  "location": "Files.MyStepdefs.resultsAreDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Display them All",
  "keyword": "And "
});
formatter.match({
  "location": "Files.MyStepdefs.displayThemAll()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.closeTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Open URL",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the Webdriver",
  "keyword": "Given "
});
formatter.match({
  "location": "Files.MyStepdefs.openTheWebdriver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter The  URL",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.enterTheURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page is Loaded",
  "keyword": "When "
});
formatter.match({
  "location": "Files.MyStepdefs.pageIsLoaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the URL",
  "keyword": "And "
});
formatter.match({
  "location": "Files.MyStepdefs.checkTheURL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Popular car models",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The page",
  "keyword": "Given "
});
formatter.match({
  "location": "Files.MyStepdefs.thePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move to Used Cars",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.moveToUsedCars()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the city",
  "keyword": "And "
});
formatter.match({
  "location": "Files.MyStepdefs.selectTheCity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page is Loaded",
  "keyword": "When "
});
formatter.match({
  "location": "Files.MyStepdefs.pageIsLoaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move to the Popular cars",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.moveToThePopularCars()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Store and Display details",
  "keyword": "And "
});
formatter.match({
  "location": "Files.MyStepdefs.storeAndDisplayDetails()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d96.0.4664.45)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MMA2928P1\u0027, ip: \u0027192.168.0.171\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\mma2928\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:58646}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: bcba33a5cc43d3267dc132896f903a50\n*** Element info: {Using\u003dxpath, value\u003d/html/body/div[11]/div/div[1]/div[1]/div[1]/div[2]/ul/li[2]/div[2]/div[4]/ul}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat UpcomingBike.Store.xmp(Store.java:43)\r\n\tat Files.MyStepdefs.storeAndDisplayDetails(MyStepdefs.java:99)\r\n\tat ✽.Store and Display details(file:///C:/Users/mma2928/IdeaProjects/Final/src/test/resources/features/openURL.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.closeTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Open URL",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the Webdriver",
  "keyword": "Given "
});
formatter.match({
  "location": "Files.MyStepdefs.openTheWebdriver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter The  URL",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.enterTheURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page is Loaded",
  "keyword": "When "
});
formatter.match({
  "location": "Files.MyStepdefs.pageIsLoaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the URL",
  "keyword": "And "
});
formatter.match({
  "location": "Files.MyStepdefs.checkTheURL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with google",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The page",
  "keyword": "Given "
});
formatter.match({
  "location": "Files.MyStepdefs.thePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move to Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.moveToLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click it",
  "keyword": "And "
});
formatter.match({
  "location": "Files.MyStepdefs.clickIt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page is Loaded",
  "keyword": "When "
});
formatter.match({
  "location": "Files.MyStepdefs.pageIsLoaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on continue with google",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.clickOnContinueWithGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Give Invalid Credentials",
  "keyword": "And "
});
formatter.match({
  "location": "Files.MyStepdefs.giveInvalidCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Capture the Invalid Message",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.captureTheInvalidMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Screenshot capture",
  "keyword": "Then "
});
formatter.match({
  "location": "Files.MyStepdefs.screenshotCapture()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Files.MyStepdefs.closeTheBrowser()"
});
formatter.result({
  "status": "passed"
});
});