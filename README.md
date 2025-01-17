# Grade-11-Computer-Science-ISU
This is a simple program of a storefront page in Java, by Terrence Gu and Andy Yu.


# Grade-11-Computer-Science-ISU
This is a simple program of a storefront page in Java, by Terrence Gu and Andy Yu.
The boilerplate - Foundation for the program
Double Balance - initiating variable for introducing a monetary balance to the user
Double sum - first initiation of sum, equaling 0 to reset it after an order is completed
sum is used as a variable to minus from balance, as well as a holding variable for the invoice.
Int []stocks - introducing a preliminary set of stocks for products.
ArrayList<String> cart - introducing the array for the user's cart.
Boolean initial choice loop --> while loop for the initial choice of admin menu and user shopping, and accounts for user input errors regarding the very initial menu.
Boolean password loop --> while loop for the admin interface password: If the user gets the password wrong, they are prompted again.
Boolean menu reset --> pre-initializing a boolean variable for the future while loop: A while loop to go back to the initial category choice selection menu.
Lines 16 - 18
Printing out the initial user-friendly prompt, welcoming the user and asking them to choose between two options: The Admin menu, or to go shopping.
Lines 19 - 53: The admin interface.
The admin action string variable is initialized to read what the admin wants to do. If the admin types exit, they are sent back to the menu, resetting the admin loop and password loop to false, returning to the outer loop: Initialchoiceloop.
A for-loop is used to clear the cart, following the admin sending the order out. A separate size variable is used to ensure array size variability will not create errors.
The sum is reset to 0, as the cart has been cleared.
Lines 45 - 47: In the case that the admin does not type cart, they are prompted to enter a valid admin action and sent back up to the admin loop. 
Lines 49 - 51: This section is an exception to the initial admin choice: Exit or Submit order. If the admin does not choose either of these options, they are also met with an exception error, sent back up to the admin loop.
Lines 53 - 56: This section is used as an error exception for the password: If the password is wrong, they are prompted to the password loop section.
Lines 58 - 66: This code is the user shopping portion: If the user inputted user shopping, instead of admin menu. The initial choice loop is set as false. This section also checks if the user wants to exit the entire program at the start, which completely sets all loops in effect at the present to false (initial choice loop, program loop, menu reset).
This section also creates an exception: If the user does not want to exit, shop, or enter the admin menu. 
Lines 66 - 85 This code initiates a category while looping for the user to input the product category. It also adds an exception if entered, not imputed existing product. Also, added an array for prices of the items to allow for easier access when adding to the total/sum.
Lines 86-151 This code loops the items in categories allowing one to browse the items in different categories and print the item, price, and stock. We added an if so that it will print out of stock when the stock hits zero.
Lines 152-353 This code allows the user to input items' names, and quantities, and add them to the cart (Array). Added exception for accessing more than the stock.

Lines 354-411 This code is the checkout, prints all items in the cart, calculator the sum of all items in the array, adds expectations such as there is nothing in the cart
Lines 412-475 This code confirms the order and also allows the user to remove items from the cart. After removing, the code adds the stock back to the items before for later use.
The code uses the “int removeint” variable to remove variables from the array in line 467, as well as to check if the user wants to exit.
The code uses exitswitch to send the user out of the program or back to the menu.







