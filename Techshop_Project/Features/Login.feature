@smoke
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

@smoke, @Regression
Scenario: User is able to search the products
Description: this scenario tests how to search for products
When User clicks on the Search Box and searches for "iphone 11"
And User clicks on the Search button
Then User can search for the "iphone" it


Scenario: User is able to click on the latest products from the home page
Description: This scenario checks the latest product
When User clicks on the latest product from the homepage 
Then User is able to view the item

Scenario: User is able to click on the cart button
When User clicks on the cart button
Then User is navigated to the cart button
Then I can validate user payment

Scenario: This is a scenario without a given or when
Then I want to check user is able to pay for the item 