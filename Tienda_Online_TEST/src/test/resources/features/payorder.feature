Feature: Process the order and pay

  Once Francisco has the desired products in the cart
  As a user
  He wants to pay the amount and confirm his order.

  Scenario: Francisco needs to review his cart, place the order and pay

    Given Francisco navigates to his cart
    When Francisco reviews his order
    Then Finally Francisco confirms his order and pays