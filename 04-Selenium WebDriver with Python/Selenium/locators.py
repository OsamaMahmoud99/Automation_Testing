import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

#Chrom driver service Selenium
driver = webdriver.Chrome()
driver.get("https://rahulshettyacademy.com/angularpractice/")

driver.find_element(By.NAME, "email").send_keys("hello@gmail.com")
driver.find_element(By.ID, "exampleInputPassword1").send_keys("12345")
driver.find_element(By.ID, "exampleCheck1").click()

# // tagname[@attribute='value] -> //input[@type='submit']
driver.find_element(By.CSS_SELECTOR, "input[name='name']").send_keys("Rahul")
driver.find_element(By.CSS_SELECTOR, "#inlineRadio1").send_keys("")

#Static Dropdown
dropdown = Select(driver.find_element(By.ID, "exampleFormControlSelect1"))
dropdown.select_by_visible_text("Female")

driver.find_element(By.XPATH, "//input[@type='submit']").click()
message = driver.find_element(By.CLASS_NAME, "alert-success").text
print(message)
assert "Success" in message

driver.find_element(By.XPATH, "(//input[@type='text'])[3]").send_keys("helloagain")


time.sleep(2)