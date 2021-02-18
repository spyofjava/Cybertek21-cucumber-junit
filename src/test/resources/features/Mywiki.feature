Feature: wikipedia search verification

  @ScenarioOutline
  Scenario Outline:Wikipedia search header verification
    Given User is on wikipedia home page
    When  User user types "<searchVale>" in the wikipedia search box
    And User clicks the search button
    Then User sees "<expectedMainHeader>" in main header
    Then User sees "<expectedTitle>" in wiki title
    Examples:
      | searchVale        | expectedMainHeader | expectedTitle     |
      | Nicholas Cage     | Nicholas Cage      | Nicholas Cage     |
      | Jackie Chan       | Jackie Chan        | Jackie Chan       |
      | Niagara waterfall | Niagara waterfall  | Niagara waterfall |
      | Iran              | Iran               | Iran              |
      | Qatar             | Qatar              | Qatar             |


