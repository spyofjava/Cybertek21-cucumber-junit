Feature: Google search feature

  Scenario: Search page title verification
    Given User is on Google home page

  @test1
  Scenario Outline: User search title verification whatever he wants
    Given User is on Google home page
    When User types "<searchValue>" in the google search box
    Then User should see apple in the title
    Then User sees "<expectedTitle>" is in the google title

    Examples: search terms we are going to search in google
      | searchValue  | expectedTitle |
      | Steve Jobs   | Steve Jobs    |
      | Chuck Norris | Chuck Norris  |
      | Marie Curie  | Marie Curie   |