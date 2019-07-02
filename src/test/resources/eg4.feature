Feature:Test background keyword
Background:display welcome
Given application displays welcome message
Scenario:signin
Given users un and pwd
And click signin

Scenario:serach for the product
When user seraches for speaker

Scenario:add to cart
When user adds the product to the cart

Scenario:payment process
When user does the payment

Scenario:log out
When user logs out
