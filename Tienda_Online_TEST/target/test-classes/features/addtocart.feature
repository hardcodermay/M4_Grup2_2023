Feature: Add products to cart

  In order to add products to the cart
  As a user
  I want to be able to select the category and add specific product(s)

  Scenario: User clicks the first two categories present at Product Store website and selects three products

    Given Francisco wants to add three products to the cart
    When Francisco clicks over the category and select one by one the products
    Then Francisco navigates to the cart page and verify that the three products are there