*** Settings ***
Documentation     All the page objects and keywords of landing page 
Library    SeleniumLibrary
Resource         ../PO/Generic.robot

*** Variables ***
${Shop_page_load}         css:.nav-link


*** Keywords ***

Enter the Country and select the terms
    [arguments]    ${country_name}
    Input Text    country    ${country_name}
    Wait Until element passed is located on Page   //a[text()='${country_name}']
    Click Element    //a[text()='${country_name}']
    Sleep           2
    Click Element    css:.checkbox label

Purchase the product and Confirm the Purchase
    Click Button    css:.btn-success
    Page Should Contain    Success!