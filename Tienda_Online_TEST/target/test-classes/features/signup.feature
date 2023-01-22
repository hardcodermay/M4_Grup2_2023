Feature: SignUp

  In order to sign up at a certain web page
  As a user
  I want to be able to sign up using username and password

  Scenario: User Sign Up at Product Store website

    Given Francisco wants to sign up at the website using username and password
    When to sign up he uses 'a random username' and 'devopsm4g2' as password
    Then he should see 'Welcome m4_grupo2' on the SigUp Results Page once Signed