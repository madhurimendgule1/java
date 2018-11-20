# Original Portal Automation
Test automation repository for the [broker portal project] (https://jira.anthem.com/projects/BPP). Project documentation can be found [here] (https://confluence.anthem.com/display/BrokerPortal/Agile+Transformation)

## Maven profiles for local settings
This project POM.xml assumes that some user and local machine properties are set via maven profiles.
+ auto.jiraPass  your JIRA username
+ auto.jiraEPass your JIRA passphrase encrypted with mvn --encrypt-password
+ webdriver.chrome.driver fully qualified path to chromedriver.exe on your local machine
+ webdriver.ispdf.driver  true

## Please Read
+ [Testing Deliverables ](https://confluence.anthem.com/display/QE/Testing+Deliverables)
+ [Test tagging Guide and tag execution string logic](https://confluence.anthem.com/display/QE/Tagging+Guide)
+ [How to use JIRA to document your tests and test execution](https://confluence.anthem.com/display/QE/Xray)
+ [Maven Config options with explanation](https://confluence.anthem.com/display/QE/Maven+Configuration+Options)

### Example maven command to execute the login test
`mvn clean test -Dcucumber.options="--tags @login" -Dexecution.environment=SIT4 -Dselenium.browser=CHROME -DforkCount=4`

## Branching strategy as of 2017-07-18
Each team has a branch. The member of the team can commit directly to thier team branch or they can create short lived branches which get merged into the team branch. When test code is ready to be merged to master create a pull request for review and merge.


Feature: Layout Bug Detector Validation
  @layout_validation
  Scenario: Valid Layout Bug and generate report
    Given the user is on the PTB login page
    When  the user logs into PTB as "PRODUCER_GENERAL_AGENCY_FULLACCESS"
    Then the user validates the layout for the page "brokers_home_page"
