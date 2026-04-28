import { test, expect } from '@playwright/test';


test.describe("Login test cases", () => {
    test("should have the correct title", async ({ page }) => {
        await page.goto('https://todo.qacart.com');
        await expect(page).toHaveTitle("QAcart Todo App - Login page");
    });

    test("should have the correct URL", async ({page}) => {
        await page.goto('https://todo.qacart.com/login');
        await expect(page).toHaveURL("https://todo.qacart.com/login");
    });

    test("header should be visile by text", async ({page}) => {
        await page.goto('https://todo.qacart.com/login');
        const header = page.locator("text=Login to Application");
        await expect(header).toBeVisible();
    });

    test("header should contain the correct text", async ({page}) => {
        await page.goto('https://todo.qacart.com/login');
        const header = page.locator('.header');
        await expect(header).toHaveText("Login to Application");
    });

    test("should be able to fill the email", async ({page}) => {
        await page.goto('https://todo.qacart.com/login');
        const emailField = page.locator('#email');
        await emailField.fill("osama@example.com")
        await expect(emailField).toHaveValue("osama@example.com");
    });

    test("should be able to fill the password by css", async ({page}) => {
        await page.goto('https://todo.qacart.com/login');
        const passwordField = page.locator('[data-testid="password"]');
        await passwordField.fill("password123")
        await expect(passwordField).toHaveValue("password123");
       
    });

    test("should be able to fill the password by xpath", async ({page}) => {
        await page.goto('https://todo.qacart.com/login');
        const passwordField = page.locator('//input[@data-testid="password"]');
        await passwordField.fill("password123")
        await expect(passwordField).toHaveValue("password123");
       
    });

    
    test("should be able to click on submit button", async ({page}) => {
        await page.goto('https://todo.qacart.com/login');
        await page.waitForURL("/login");
        await page.locator('#email').fill("osama@example.com");
        await page.locator('//input[@data-testid="password"]').fill("password123");
        const submitButton = page.locator('button:has-text("Login")');
        await submitButton.waitFor({state: "visible", timeout: 60000});
        await submitButton.click();
        await expect(page).toHaveTitle("QAcart Todo App - Todos page", {timeout: 60000});

    });
});
