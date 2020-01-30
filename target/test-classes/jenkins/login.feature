Feature: Registration Test
Scenario Outline: validate registration woth multiple data
* user navigates to registration page
* user enters firstname as "<username>" in fn field 
* user enters password as "<password>"  in pd field
* user click on login button
* validate registration

Examples:
|username|password|confirmpassword|
|rakulpreet|rakul789|rakul789|