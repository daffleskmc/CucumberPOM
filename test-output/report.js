$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/indeztruk/eclipse-workspace/CucumberPOM/src/main/java/com/cucumber/pom/feature/cp.feature");
formatter.feature({
  "line": 1,
  "name": "Cucumber POM Feature",
  "description": "",
  "id": "cucumber-pom-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Tutorials Ninja Page",
  "description": "",
  "id": "cucumber-pom-feature;tutorials-ninja-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens tutorials ninja page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is in login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user logs in",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user validates home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "CPLoginSteps.user_opens_tutorials_ninja_page()"
});
formatter.result({
  "duration": 13676758400,
  "status": "passed"
});
formatter.match({
  "location": "CPLoginSteps.user_is_in_login_page()"
});
formatter.result({
  "duration": 66451600,
  "status": "passed"
});
formatter.match({
  "location": "CPLoginSteps.user_enters_email_and_password()"
});
formatter.result({
  "duration": 1095326200,
  "status": "passed"
});
formatter.match({
  "location": "CPLoginSteps.user_validates_home_page_title()"
});
formatter.result({
  "duration": 9614200,
  "status": "passed"
});
});