Feature: Testing login functionality to the application
# Comment

# Background : Optional. You have to put all the common steps 
# Description: What is in the requirement

Background: User can login using the correct username and password

Given User opens the browser
And User navigates to "https://www.smarttechqa.com"
When User Clicks on the sign in button
And User Enters the email
And User Eneters the password
And User Clicks on the login button
Then The user is successfully logged in and username is displayed
And User is navigated to home page

Scenario: User is able to search the products
Description: this scenario tests how to search for products
When User clicks on the Search Box and searches for "iphone 11"
And User clicks on the Search button
Then User can search for the "iphone" item
