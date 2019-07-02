Feature:Test background 
@smoke
Scenario:signin
Given users un and pwd
And click signin
@regression
Scenario:serach for the product
When user seraches for speaker
@smoke @regression
Scenario:add to cart
When user adds the product to the cart
@regression
Scenario:payment process
When user does the payment
@smoke
Scenario:log out
When user logs out
