Feature: Login Functionality
@data-driven
Scenario: Login with valid credentials
Given Navigate to home page
When users enter username or password
Then user logged in successfully
@user-specific
Scenario Outline: Login with valid credentials
 Given Navigate to home page
 When users enter "<username>" and "<password>"
 Then user logged in successfully

Examples:
|username|password|
|lalitha|Password123|
|ABC|XYZ|


@data-driven
Scenario: the one where users pick different product through search functionality
When Larry searches below products in the search box
|Headphone|
|Carpet|
Then product should be added in the cart if available



