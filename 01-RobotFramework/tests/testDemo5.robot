*** Settings ***
Documentation    To validate the Login form
Library    SeleniumLibrary
Library    DataDriver    file=resources/data.csv    encoding=utf-8
Test Teardown    Close Browser
Test Template    Validate UnSuccessful Login


*** Variables ***
${Error_Message_Login}    css:.alert-danger

*** Test Cases ***
Login with user ${username} and password ${password}    xyz   123


*** Keywords ***
Validate UnSuccessful Login
    [Arguments]    ${username}    ${password}
    open the browser with the Mortgage payment url
    Fill the login Form    ${username}    ${password}
    wait Until Element is located in the page
    verify error message is correct

open the browser with the Mortgage payment url
    Create WebDriver    Chrome
    Go To    https://rahulshettyacademy.com/loginpagePractise/


Fill the login Form
    [arguments]       ${username}   ${password}
    Input Text        id:username    ${username}
    Input Password    id:password    ${password}
    Click Button      id:signInBtn

wait Until Element is located in the page
    Wait Until Element Is Visible   ${Error_Message_Login} 

verify error message is correct
    ${result}=     Get Text   ${Error_Message_Login}
    Should Be Equal As Strings    ${result}    Incorrect username/password.
    Element Text Should Be    ${Error_Message_Login}    Incorrect username/password.