Feature: Login

  In order to log in at a certain web page
  As a user
  I want to be able to log in using username and password

  Scenario: User Login at Product Store website

    Given Francisco wants to log in at the website using username and password
    When he uses 'm4_grupo2' as the username and 'devopsm4g2' as password
    Then he should see 'Welcome m4_grupo2' on the Login Results Page