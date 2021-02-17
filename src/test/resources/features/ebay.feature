Feature: Ebay search feature


  Scenario: Ebay default title verification
    Given user is on the Ebay home page
    Then user should see Ebay title as expected

  @ebay
  Scenario: Ebay default title verification
    Given user is on the Ebay home page
    When user search for "LG Led TV"
    Then user should see "LG Led TV" title as expected

