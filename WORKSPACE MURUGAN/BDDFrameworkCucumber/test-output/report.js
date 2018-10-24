$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login page validation",
  "description": "",
  "id": "free-crm-login-page-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To validate Free CRM Login Test with valid credentails",
  "description": "",
  "id": "free-crm-login-page-validation;to-validate-free-crm-login-test-with-valid-credentails",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Login page is available to access",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "page navigates without error",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepdefinition.Login_page_is_available_to_access()"
});
formatter.result({
  "duration": 18452461624,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefinition.User_enter_the_valid_credentials()"
});
formatter.result({
  "duration": 21957236,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefinition.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 533250109,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefinition.page_navigates_without_error()"
});
formatter.result({
  "duration": 145180180,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"tag name\",\"selector\":\"submit\"}\n  (Session info: chrome\u003d68.0.3440.106)\n  (Driver info: chromedriver\u003d70.0.3538.16 (16ed95b41bb05e565b11fb66ac33c660b721f778),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027L-156073908\u0027, ip: \u002710.213.189.109\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 70.0.3538.16 (16ed95b41bb05..., userDataDir: C:\\Users\\mu307892\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:60728}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 68.0.3440.106, webStorageEnabled: true}\nSession ID: 3e46346dc326e7d0ad93c816ed4f5828\n*** Element info: {Using\u003dtag name, value\u003dsubmit}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByTagName(RemoteWebDriver.java:392)\r\n\tat org.openqa.selenium.By$ByTagName.findElement(By.java:320)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat Stepdefinition.LoginStepdefinition.page_navigates_without_error(LoginStepdefinition.java:41)\r\n\tat ✽.And page navigates without error(Login.feature:8)\r\n",
  "status": "failed"
});
});