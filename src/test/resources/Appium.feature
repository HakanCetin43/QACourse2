Feature: testing apks dynamically independent from activity and package
  Scenario: user should proceed pages on appiumDemos animation activity
    #Given user install "appium_application" goes "Animation page"
    When user clicks "FADE_IN"
    And user clicks "LIST_DIALOG"
    And user clicks "Command_ONE"
    Then user views "Command_One_Chosen"
    And user press key "BACK"
    And user press key "APP_SWITCH"
    And user press key "HOME"
