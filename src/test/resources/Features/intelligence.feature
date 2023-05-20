Feature: Verify Search Intelligence Function

  Scenario: Search for an item and verify search intelligence
    Given user is on ebay website home page
    When user search for SearchItem
    And Click the search option
    Then user can see result for the SearchItem