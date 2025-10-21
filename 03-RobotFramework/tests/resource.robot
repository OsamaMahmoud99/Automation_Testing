*** Settings ***
Documentation     A resource file with reusable keywords and variables.
...
...               The system specific keywords created here form our own
...               domain specific language. They utilize keywords provided
...               by the imported SeleniumLibrary.
Library           SeleniumLibrary

*** Variables ***
${user_name}           rahulshettyacademy
${invalid_password}    123456
${valid_password}      learning
${login_url}           https://rahulshettyacademy.com/loginpagePractise/

*** Keywords ***

open the browser with the Mortgage payment url
    Create WebDriver    Chrome
    Go To    ${login_url}

Close Browser session
    Close Browser

