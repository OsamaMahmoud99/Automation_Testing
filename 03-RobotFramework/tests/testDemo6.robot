*** Settings ***
Documentation    To validate the Login form
Library    SeleniumLibrary
Library    Collections
Library    ../customLibraries/shop.py
Test Setup       open the browser with the Mortgage payment url
Suite Setup      
Suite Teardown
#Test Teardown    Close Browser session
Resource         ../PO/Generic.robot
Resource         ../PO/LandingPage.robot
Resource         ../PO/ShopPage.robot
Resource         ../PO/CheckoutPage.robot
Resource         ../PO/ConfirmationPage.robot

*** Variables ***
${List_of_Products}         Blackberry    Nokia Edge
${country_name}           India
*** Test Cases ***
Validate UnSuccessful Login
    
    LandingPage.Fill the login Form    ${user_name}    ${invalid_password}
    LandingPage.wait Until Element is located in the page
    LandingPage.verify error message is correct

Validate Cards display in the Shopping Page
    LandingPage.Fill the login Form    ${user_name}    ${valid_password}
    ShopPage.wait Until Element is located in the page
    ShopPage.Verify Card titles in the Shop page
    add items to cart and checkout    ${List_of_Products}
    CheckoutPage.Verify items in the Checkout Page and proceed
    ConfirmationPage.Enter the Country and select the terms    ${country_name}
    ConfirmationPage.Purchase the product and Confirm the Purchase


Select the Form and navigate to Child window
    LandingPage.Fill the Login Details and Login Form


