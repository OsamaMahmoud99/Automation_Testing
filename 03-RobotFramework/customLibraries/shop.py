from robot.api.deco import library, keyword
from robot.libraries.BuiltIn import BuiltIn

@library
class shop:

    def __init__(self):
        # initializer left intentionally empty
        self.selfLib = BuiltIn().get_library_instance('SeleniumLibrary')

    @keyword
    def hello_world(self):
        print("Hello, world!")
    
    @keyword
    def add_items_to_cart_and_checkout(self, productList):
        i = 1
        productsTitles = self.selfLib.get_webelement("css:.card-title")
        for productTitle in productsTitles:
            if productTitle.text in productList:
                self.selfLib.click_button("xpath:(//*[@class='card-footer'])["+str(i)+"]/button")
            i += 1