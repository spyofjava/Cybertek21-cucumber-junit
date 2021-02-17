Feature: Amazon search feature


  Scenario: Amazon default title verification
    Given user is on the Amazon landing page
    Then user should see Amazon title as expected

    #expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  @Amazon
  Scenario: Amazon search title verification
    Given user is on the Amazon landing page
    When users search for "wooden spoon"
    Then user should see "wooden spoon" in the Amazon title


