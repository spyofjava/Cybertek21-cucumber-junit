Feature: google search verification

  @Mygoogle
  Scenario Outline:google search header verification
    Given User is on google home page
    When  User user types "<searchVale>" in the google search box
    And User clicks the search button
    Then User sees "<expectedTitle>" in google title

    Examples:
      | searchVale           | expectedMainHeader   | expectedTitle        |
      | mobilya              | mobilya              | mobilya              |
      | kadir inanir         | kadir inanir         | kadir inanir         |
      | Kemal sunal          | Kemal sunal          | Kemal sunal          |
      | Nasa                 | Nasa                 | Nasa                 |
      | Russia sky resources | Russia sky resources | Russia sky resources |


