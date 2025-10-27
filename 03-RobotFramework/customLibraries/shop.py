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
        products_titles = self.selfLib.get_webelements("css:.card-title")  # plural
        for product_title in products_titles:
            title = product_title.text.strip()
            if title in productList:
                self.selfLib.click_button(f"xpath:(//*[@class='card-footer'])[{i}]/button")
            i += 1
        self.selfLib.click_link("css:li.active a")  # fixed typo
