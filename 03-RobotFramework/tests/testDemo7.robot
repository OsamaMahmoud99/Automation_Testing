*** Settings ***
Library    Collections
Library    RequestsLibrary


*** Variables ***
${base_url}    https://rahulshettyacademy.com 
${book_id}
${book_name}    RobotFramework

*** Test Cases ***
Play around with Dictionary
    [Tags]    API
    &{data}=    Create Dictionary     name=rahulshetty   course=robot    website=rahulshettyacademy.com
    Log    ${data}
    Dictionary Should Contain Key     ${data}    name
    Log    ${data}[name]
    ${url}=    Get From Dictionary    ${data}    website
    Log    ${url}

Add Book into Library DataBase
    [Tags]    API
    &{req_body}=    Create Dictionary   name=${book_name}    isbn=9443353    aisle=324354    author=rahulshetty
    ${response}=    POST    ${base_url}/Library/Addbook.php    json=${req_body}    expected_status=200
    Log    ${response.json()}
    Dictionary Should Contain Key    ${response.json()}    ID
    ${book_id}=    Get From Dictionary    ${response.json()}    ID 
    Set Global Variable    ${book_id}
    Log    ${book_id}  
    Status Should Be    200    ${response}

Get the Book Details which got added
    [Tags]    API
    ${get_response}=    GET     ${base_url}/Library/GetBook.php   params=ID=${book_id}    expected_status=200
    Log    ${get_response.json()}
    Should Be Equal As Strings    ${book_name}   ${get_response.json()}[0][book_name]

Delete the Book from the Database
    [Tags]    API
    &{delete_body}=    Create Dictionary    ID=${book_id}
    ${delete_response}=    POST    ${base_url}/Library/DeleteBook.php    json=${delete_body}    expected_status=200
    Log    ${delete_response.json()}
    Should Be Equal As Strings    book is successfully deleted    ${delete_response.json()}[msg]