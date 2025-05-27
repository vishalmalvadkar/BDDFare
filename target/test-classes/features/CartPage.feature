Feature: Validate the Cart products
  Scenario: Verify the vegitables are added to cart
    Given User is on HomePage
    When User searches a perticular vegitables
    And add more than 2 vegitables with quantity more than 1
    Then User Validate the selected vegitables are added to the cart