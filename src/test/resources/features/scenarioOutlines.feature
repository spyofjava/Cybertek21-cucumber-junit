Feature: Smartbear order feature

  @
  Scenario Outline: User ordering a product from Orders page
    Given User is logged into SmartBear Tester account and on Order page
    When User fills out the form as followed from the table below:
    And User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<customer name>" to costumer name
    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters "<zip>" to zip
    And User selects "<cardType>" as card type
    And User enters "<card number>" to card number
    And User enters "<expiration date>" to expiration date
    And User clicks process button
    Then User verifies "<costumer name>" is in the list

    Examples:
      | product | quantity | customer name | street        | city   | state   | zip   | cardType | card number    | expiration date | customer name |
      | myMoney | 2        | jamal         | 122 london st | london | chelsea | 55323 | visa     | 33444335553333 | 12/22           | jamal         |
      |