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
formatter.step({
  "line": 10,
  "name": "Login page is available to access",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter the valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "page navigates without error",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepdefinition.Login_page_is_available_to_access()"
});
formatter.result({
  "duration": 14011094985,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d68.0.3440.106)\n  (Driver info: chromedriver\u003d70.0.3538.16 (16ed95b41bb05e565b11fb66ac33c660b721f778),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027L-156073908\u0027, ip: \u002710.213.132.229\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 70.0.3538.16 (16ed95b41bb05..., userDataDir: C:\\Users\\mu307892\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:50138}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 68.0.3440.106, webStorageEnabled: true}\nSession ID: b1f7acda090c52988899f8ce32e12ee5\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:276)\r\n\tat Stepdefinition.LoginStepdefinition.Login_page_is_available_to_access(LoginStepdefinition.java:26)\r\n\tat ✽.Given Login page is available to access(Login.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepdefinition.User_enter_the_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefinition.user_clicks_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefinition.page_navigates_without_error()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefinition.Login_page_is_available_to_access()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefinition.User_enter_the_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefinition.user_clicks_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefinition.page_navigates_without_error()"
});
formatter.result({
  "status": "skipped"
});
});