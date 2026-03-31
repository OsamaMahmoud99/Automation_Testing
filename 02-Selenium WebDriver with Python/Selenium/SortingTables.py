import time

from selenium import webdriver
from selenium.webdriver.common.by import By

browserSortedVeggies = []

driver = webdriver.Chrome()
driver.get("http://www.rahulshettyacademy.com/seleniumPractise/#/offers")

# click on column header
driver.find_element(By.XPATH, "//span[text()='Veg/fruit name']").click()

# collect all veggie names -> veggieList
veggieWebElements = driver.find_elements(By.XPATH, "//tr/td[1]")
for ele in veggieWebElements:
    browserSortedVeggies.append(ele.text)

originalBrowserSortedList = browserSortedVeggies.copy()

# Sort this voggieList => newSortedList
browserSortedVeggies.sort()

# veggieList == newSortedList
assert browserSortedVeggies == originalBrowserSortedList

time.sleep(5)