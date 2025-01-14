# Grade-11-Computer-Science-ISU
This is a simple program of a storefront page in Java, by Terrence Gu and Andy Yu.
Format: Lines (#) - (#): Explanation, overall functionality/purpose
Lines 1 - 6: The boilerplate - Foundation for the program. Double Balance - initiating variable for introducing a monetary balance to the user
Line 7: Double sum - first initiation of sum, equaling 0 to reset it after an order is completed
sum is used as a variable to minus from balance, as well as a holding variable for the invoice.
Lines 8 - 9: Initiating two arrays: int []stocks - introducing a preliminary set of stocks for products. ArrayList<String> cart - introducing the array for the user's cart.
Lines 10 - 11: Initiating and implementing a loop for the program, using the variable boolean program loop. This is used throughout the code to reset the program's start.
Lines 12 - 14: Initiating various variables: boolean initialchoiceloop --> while loop for the initial choice of admin menu and user shopping, and accounts for user input errors regarding the very initial menu. boolean passwordloop --> while loop for the admin interface password: If the user gets the password wrong, they are prompted again. boolean menureset --> pre-initializing a boolean variable for the future while loop: A while loop to go back to the initial category choice selection menu.
Line 15: Using boolean initialchoiceloop in a loop to account for user input errors regarding the very initial menu.
Lines 16 - 18: Printing out the initial user-friendly prompt, welcoming the user and asking them to choose between two options: The Admin menu, or to go shopping.
Lines 19 - 53: The admin interface.
Line 19: checking what the user entered into the system: if it is "admin menu", go into the admin interface codeblock.
Line 20: While loop to ensure that the user has inputted in the correct passcode. In the case of an incorrect passcode, the user is prompted again. In the case of a correct password, continue on to the admin interface.
Lines 21 - 24: Receiving the password from the user, while also checking if the user wants to return back to the menu by typing "exit".
Lines 25 to 28: Ensuring that the user password is correct, if not, using passwordloop to reprompt the user. In the case that the password is correct, the user is introduced into the mainframe of the admin interface.
Boolean adminloop and while loop for admin interface: as to create a closed loop for the admin interface, allowing the admin to spend time in the admin interface until:
Lines 29 to 33: Adminaction string variable is initialized to read what the admin wants to do. If the admin types exit, they are sent back to the menu, resetting the adminloop and passwordloop to false, returning back to the outer loop: Initialchoiceloop.
Lines 34 to 48: In the case that the admin does not type exit, it is expected that the admin will type in the option: Submit order. This will prompt the admin to type what order to submit. It is expected that the admin will enter "cart", as that is the order name. 
A for-loop is used to clear the cart, following the admin sending the order out. A separate size variable is used as to ensure array size variability will not create errors. The sum is reset to 0, as the cart has been cleared.
Lines 45 - 47: In the case that the admin does not type cart, they are prompted to enter a valid admin action and sent back up to the adminloop loop. 
Lines 49 - 51: This section is an else exception off of the initial admin choice: Exit or Submit order. If the admin does not choose either of these options, they are also met with an exception error, sent back up to the adminloop loop.
Lines 53 - 56: This section is used as an error exception for the password: If the password is wrong, they are reprompted to the password loop section.
Lines 58 - 66: This code is the user shopping portion: If the user inputted user shopping, instead of admin menu. The initialchoiceloop is set as false. This section also checks if the user wanted to exit the entire program at the start, which completely sets all loops in effect at the present to false (initialchoiceloop, programloop, menureset). This section also creates an exception: If the user does not want to exit, nor user shop, nor enter the admin menu. 








