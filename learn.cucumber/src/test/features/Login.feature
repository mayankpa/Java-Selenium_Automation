Feature: Login into website

  @Smoke
  Scenario : Login into website
    Given I navigate url
    When I land on homepage
    Then I see Login button

    Scenario Outline: Verify Policy display one Landing Page
      Given I navigate url
      When I land on homepage
      And I see Login button
      And I click on Login button
      And I enter <uid> and <Password>
      Then I see policyowner Landding page
      And I see the list of Ploicy <>
      Examples:

      Scenario:



      S