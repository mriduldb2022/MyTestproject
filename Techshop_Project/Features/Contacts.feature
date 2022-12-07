Feature: Contact Us Page

Background:
When User clicks on the Contact Us Page


#Multi Select
Scenario: User can perform multi Select

When User clicks on Monday and Tuesday selection
Then Monday and Tuesday are selected

#Check Boxes
Scenario: User can click on the checkboxes
When User clicks on Morning and Afternoon checkboxes
Then Morning and Afternoon checkboxes are selected 
And Evening checkboxes is not selcted

#Window handling 
Scenario: User can opn a new tab window and switch 
When User opens a new tab window 
Then User switches to the new tab window and close and switch back to the old tab 