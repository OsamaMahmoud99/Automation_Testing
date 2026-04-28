
import {expect, test} from '@playwright/test'

test("should be able to login using the API", async({request}) => {

    const response = await request.post("https://todo.qacart.com/api/v1/users/login", 
        {
            data: {
                email: "usamamahmoud.2022@gmail.com",
                password: "Welcome_1899"
            },
        },
    );

  
  
    // Assert status
    expect(response.ok()).toBeTruthy();

    // Assert response body
    const body = await response.json();
    expect(body).toHaveProperty("firstName", "Osama");

});