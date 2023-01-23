Feature: Remove products from cart

  In order to remove from the cart
  As a user
  I want to be able to go to the cart and remove specific product(s)

  Scenario: Francisco navigates to Store Cart page and removes one product

    Given Francisco has already items on the cart and wants to remove one products
    When Francisco navigates to the cart page and remove one product
    Then Francisco verify that the 'product' is successfully removed