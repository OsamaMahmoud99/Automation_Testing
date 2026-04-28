
import {chromium, expect} from "@playwright/test";

async function globalConfig() {
    
    const browser = await chromium.launch();
    const page = await browser.newPage();

    await page.goto('https://todo.qacart.com/login');
    await page.locator('#email').fill("usamamahmoud.2022@gmail.com");
    await page.locator('//input[@data-testid="password"]').fill("Welcome_1899");
    await page.locator('button:has-text("Login")').click();
    const welcomeMessage =  page.locator('[data-testid="welcome"]')
    await expect(welcomeMessage).toBeVisible();
    await page.context().storageState({
        path: 'storageState.json'
    })
}

export default globalConfig;