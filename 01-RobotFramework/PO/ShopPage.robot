*** Settings ***
Documentation     All the page objects and keywords of landing page
Library           SeleniumLibrary

*** Variables ***
${Shop_page_load}           css:.nav-link



*** Keywords ***

wait until Element is located in the page
    Wait Until element passed is located on Page      ${Shop_page_load}


Verify Card titles in the Shop page
    @{expectedList}=    Create List    iphone X    Samsung Note 8    Nokia Edge    Blackberry
    @{elements}=        Get WebElements    css:.card-title
    @{actualList}=      Create List
    FOR    ${el}    IN    @{elements}
        ${txt}=    Get Text     ${el}
        Log    ${txt}
        Append To List    ${actualList}    ${txt}
    END
    Lists Should Be Equal    ${actualList}    ${expectedList}


Select the Card
    [Arguments]    ${cardName}
    @{elements}=   Get WebElements    css:.card-title
    ${found}=      Set Variable    ${FALSE}
    FOR    ${idx}    ${el}    IN ENUMERATE    @{elements}
        ${title}=   Get Text    locator=    ${el}
        Exit For Loop If    '${title}' == '${cardName}'
    END
    Run Keyword Unless    '${title}' == '${cardName}'    Fail    Card '${cardName}' not found
    ${idx1}=      Evaluate    ${idx} + 1
    Click Button   xpath=(//*[@class='card-footer'])[${idx1}]/button