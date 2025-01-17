import java.util.*;
public class Storefront {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exitswitch;
        double balance = 10000.00;
        double sum = 0;
        int[] stocks = {4, 10, 6, 5, 3, 7, 2, 1, 4, 11, 8, 9, 10}; // Stock per item
        ArrayList<String> cart = new ArrayList<>(); // Cart, add items
        boolean programloop = true;
        while (programloop) {
            boolean initialchoiceloop = true;
            boolean passwordloop = true;
            boolean menureset = true; // for the cart
            while (initialchoiceloop) {
                System.out.println("Welcome to TerrandiMart!");
                System.out.println("Admin Menu or User Shopping - Type exit to quit.");
                String adminoruser = sc.nextLine().toLowerCase();
                if (adminoruser.equals("admin menu")) {
                    while (passwordloop) {
                        System.out.println("Enter password (Type exit to exit)");
                        String password = sc.nextLine();
                        if (password.equals("exit")) {
                            passwordloop = false;
                        } else if (password.equals("MrsRastegarIsTheBest12345")) {
                            System.out.println("Access granted");
                            boolean adminloop = true;
                            while (adminloop) {
                                System.out.println("Choose an admin action. Type exit to exit this menu.\n 1. submit Order");
                                String adminaction = sc.nextLine().toLowerCase();
                                if (adminaction.equals("exit")) {
                                    adminloop = false;
                                    passwordloop = false;
                                } else if(adminaction.equals("submit order")){
                                    System.out.println("Orders:");
                                    System.out.println("cart: " + cart);
                                    System.out.println("Type name of order to submit");
                                    if (sc.nextLine().equals("cart")) {
                                        System.out.println("Order has been submitted");
                                        int size = cart.size(); //as to perserve cart size.
                                        for (int x = 0; x < size; x++) {
                                            cart.remove(0);
                                        }
                                        sum = 0;
                                    } else {
                                        System.out.println("That is an invalid order to fulfill.");

                                    }
                                } else {
                                    System.out.println("Please enter a valid admin action!");
                                }
                            }
                        } else {
                            System.out.println("Incorrect. Please re-enter the password.");
                        }
                    }

                } else if (adminoruser.equals("user shopping")) {
                    initialchoiceloop = false;
                } else if(adminoruser.equals("exit")) {
                    initialchoiceloop = false;
                    programloop = false;
                    menureset = false;
                } else {
                    System.out.println("Please enter a correct option: Admin Menu, User Shopping, or Exit.");
                }   
            }
            while (menureset) {
                boolean CategoryError = true; //Defining error variable for checking if user states a correct product category.
                String category = "";//Universal holding variable
                while (CategoryError) { // A loop to verify if the user queries a correct product category.
                    System.out.println("Choose a product category.");
                    System.out.println("Electronics\nClothing\nFurniture\nBooks");
                    System.out.println("Current balance is: $" + balance);
                    category = sc.nextLine().toLowerCase(); //updating category to user preference, ignoring case sensitivity.

                    if (!category.equals("electronics") && !category.equals("clothing") && !category.equals("furniture") && !category.equals("books")) {
                        System.out.println("Please type in a valid product category.");
                    } else {
                        CategoryError = false; //If user enters a correct category, the loop will break.
                    }
                }
                ArrayList<Double> productcosts = new ArrayList<>();
                productcosts.add(500.00); productcosts.add(900.00); productcosts.add(78.50); //electronics
                productcosts.add(30.00); productcosts.add(45.50); productcosts.add(16.50); //clothing
                productcosts.add(900.00);productcosts.add(1094.50);productcosts.add(81.00); //furniture
                productcosts.add(25.00); productcosts.add(10.00); productcosts.add(12.50); productcosts.add(8.50); //books

                boolean productloop = true;
                while (productloop) {
                    switch (category) {
                        case "electronics" -> {
                            if(stocks[0] == 0)
                                System.out.println("4K Samsung Television: stock: " + "OUT OF STOCK" + ". Price is $499.99");
                            else
                                System.out.println("4K Samsung Television: stock: " + stocks[0] + ". Price is $499.99");
                            if (stocks[1] == 0)
                                System.out.println("Iphone 16: stock: " + "OUT OF STOCK" + ". Price is $899.99");
                            else
                                System.out.println("Iphone 16: stock is " + stocks[1] + ". Price is $899.99");

                            if (stocks[2] == 0)
                                System.out.println("Dyson Vacuum: stock: " + "OUT OF STOCK" + ". Price is $78.50");
                            else
                                System.out.println("Dyson Vacuum: stock is " + stocks[2] + ". Price is $78.50");
                        }
                        case "clothing" -> {
                            if (stocks[3] == 0 )
                                System.out.println("Nike T-Shirt: stock: " + "OUT OF STOCK" + ". Price is $29.99");
                            else
                                System.out.println("Nike T-Shirt: stock: " + stocks[3] + ". Price is $29.99");
                            if (stocks[4] == 0)
                                System.out.println("Adidas Sweater: stock: " + "OUT OF STOCK" + ". Price is $45.50");
                            else
                                System.out.println("Adidas Sweater: stock: " + stocks[4] + ". Price is $45.50");
                            if (stocks[5] == 0)
                                System.out.println("Puma Sweatpants: stock: " + "OUT OF STOCK" + ". Price is $16.50");
                            else
                                System.out.println("Puma Sweatpants: stock: " + stocks[5] + ". Price is $16.50");
                        }
                        case "furniture" -> {
                            if (stocks[6] == 0)
                                System.out.println("Long couch: stock: " + "OUT OF STOCK" + ". Price is $899.99");
                            else
                                System.out.println("Long couch: stock: " + stocks[6] + ". Price is $899.99");
                            if (stocks[7] == 0)
                                System.out.println("Dining Set: stock: " + "OUT OF STOCK" + ". Price is $1094.50");
                            else
                                System.out.println("Dining Set: stock: " + stocks[7] + ". Price is $1094.50");
                            if (stocks[8] == 0)
                                System.out.println("Cushioned Chair: stock: " + "OUT OF STOCK" + ". Price is $80.99");
                            else
                                System.out.println("Cushioned chair: stock: " + stocks[8] + ". Price is $80.99");
                        }
                        default -> {
                            if (stocks[9] == 0)
                                System.out.println("Harry Potter Series: stock: " + "OUT OF STOCK" + ". Price is $24.99");
                            else
                                System.out.println("Harry Potter Series: stock: " + stocks[9] + ". Price is $24.99");
                            if (stocks[10] == 0)
                                System.out.println("Hunger Games: stock: " + "OUT OF STOCK" + ". Price is 10.00");
                            else
                                System.out.println("Hunger Games: stock: " + stocks[10] + ". Price is $10.00");
                            if (stocks[11] == 0)
                                System.out.println("Lord Of The Rings: stock: " + "OUT OF STOCK" + ". Price is $12.50");
                            else
                                System.out.println("Lord Of The Rings: stock: " + stocks[11] + ". Price is $12.50");
                            if (stocks[12] == 0)
                                System.out.println("Dune: stock: " + "OUT OF STOCK" + ". Price is $8.50");
                            else
                                System.out.println("Dune: stock: " + stocks[12] + ". Price is $8.50");
                        }
                    }

                    System.out.println("Enter item for purchase: (Type \"checkout\" to continue to checkout. Type \"Menu\" to go back)");
                    String add = sc.nextLine().toLowerCase(); // universal holding variable
                    if (add.equals("menu")) {
                        System.out.println("returning to menu.");
                        break;
                    } else {
                        switch (add) {
                            case "4k samsung television" -> {
                                System.out.println("How many 4K Samsung Televisions?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[0] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[0] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("4k Samsung Television");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "iphone 16" -> {
                                System.out.println("How many Iphone 16s?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[1] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[1] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Iphone 16");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "dyson vacuum" -> {
                                System.out.println("How many Dyson Vacuums?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[2] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[2] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Dyson Vacuum");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "nike t-shirt" -> {
                                System.out.println("How many Nike T-Shirts?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[3] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[3] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Nike T-Shirt");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "adidas sweater" -> {
                                System.out.println("How many Adidas Sweaters?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[4] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[4] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Adidas sweater");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "puma sweatpants" -> {
                                System.out.println("How many Puma Sweatpants?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[5] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[5] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Puma Sweatpants");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "long couch" -> {
                                System.out.println("How many long couches?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[6] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[6] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Long couch");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "dining set" -> {
                                System.out.println("How many Dining sets?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[7] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[7] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Dining set");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "cushioned chair" -> {
                                System.out.println("How many Cushioned Chairs?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[8] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[8] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Cushioned chair");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "harry potter series" -> {
                                System.out.println("How many harry potter series?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[9] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[9] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Harry Potter series");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "hunger games" -> {
                                System.out.println("How many Hunger Games books?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[10] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[10] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Hunger Games");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "lord of the rings" -> {
                                System.out.println("How many Lord of the Rings books?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[11] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[11] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Lord of the Rings");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "dune" -> {
                                System.out.println("How many Dune books?");
                                int amount = Integer.parseInt(sc.nextLine());
                                if (stocks[12] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else if(amount <= 0) {
                                    System.out.println("Please enter a valid quantity: 1 or above!");
                                } else {
                                    stocks[12] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Dune");
                                    }
                                }
                                System.out.println("Cart: " + cart);
                            }
                            case "checkout" -> {
                                boolean CartLoop = true;
                                while (CartLoop) {
                                    System.out.println("Here is your cart:");
                                    int i = 1;
                                    for (String product : cart) {
                                        if (product.equals("4k Samsung Television")) {
                                            System.out.println(i + ". " + "4k Samsung Television: $499.99");
                                            sum += productcosts.get(0);
                                        } else if (product.equals("Iphone 16")) {
                                            sum += productcosts.get(1);
                                            System.out.println(i + ". " + "Iphone 16: $899.99");
                                        } else if (product.equals("Dyson Vacuum")) {
                                            sum += productcosts.get(2);
                                            System.out.println(i + ". " + "Dyson Vacuum: $78.50");
                                        } else if (product.equals("Nike T-Shirt")) {
                                            sum += productcosts.get(3);
                                            System.out.println(i + ". " + "Nike T-Shirt: $29.99");
                                        } else if (product.equals("Adidas sweater")) {
                                            sum += productcosts.get(4);
                                            System.out.println(i + ". " + "Adidas Sweater: $45.50");
                                        } else if (product.equals("Puma Sweatpants")) {
                                            sum += productcosts.get(5);
                                            System.out.println(i + ". " + "Puma Sweatpants: $16.50");
                                        } else if (product.equals("Long couch")) {
                                            sum += productcosts.get(6);
                                            System.out.println(i + ". " + "Long couch: $899.99");
                                        } else if (product.equals("Dining set")) {
                                            sum += productcosts.get(7);
                                            System.out.println(i + ". " + "Dining Set: $1094.50");
                                        } else if (product.equals("Cushioned chair")) {
                                            sum += productcosts.get(8);
                                            System.out.println(i + ". " + "Cushioned Chair: $80.99");
                                        } else if (product.equals("Harry Potter series")) {
                                            sum += productcosts.get(9);
                                            System.out.println(i + ". " + "Harry Potter series: $24.99");
                                        } else if (product.equals("Hunger Games")) {
                                            sum += productcosts.get(10);
                                            System.out.println(i + ". " + "Hunger Games: $10.00");
                                        } else if (product.equals("Lord of the Rings")) {
                                            sum += productcosts.get(11);
                                            System.out.println(i + ". " + "Lord Of The Rings: $12.50");
                                        } else if (product.equals("Dune")) {
                                            sum += productcosts.get(12);
                                            System.out.println(i + ". " + "Dune: $8.50");
                                        } else {
                                            System.out.println("Please enter possible items");
                                        }
                                        i++;
                                    }
                                    System.out.println("The total sum of all items are $" + sum);
                                    if(sum == 0) {
                                        System.out.println("Please purchase something before you checkout. Your cart is empty!");
                                        break;
                                    } else if(balance - sum < 0) {
                                        System.out.println("Warning! You do not have enough money in your balance!");
                                        System.out.println("Your balance is currently $" + balance);
                                    }
                                    double total = sum; //just saving the total for later use.
                                    sum = 0;
                                    System.out.println("Enter product number to remove. Enter 0 to confirm the order!");
                                    int removeint = Integer.parseInt(sc.nextLine());
                                    if(removeint == 0) {
                                        productloop = false;
                                        CartLoop = false;
                                        System.out.println("Order prepped! Type \"back\" to add more to your cart. Type \"complete\" to finalize your order.");
                                        balance -= total;
                                        exitswitch = sc.nextLine();
                                        if (exitswitch.toLowerCase().equals("complete")) {
                                            System.out.println("Thank you for purchasing! Order sent!");
                                            System.out.println("Your balance is now: $" + balance);
                                            menureset = false;
                                            programloop = true;
                                        } else if(exitswitch.toLowerCase().equals("back")) {
                                            CartLoop = false;
                                        } else {
                                            System.out.println("Please choose a valid option.");
                                        }
                                    } else {
                                        String item = cart.get(removeint - 1);
                                        switch (item) {
                                            case "4k Samsung Television" ->
                                                stocks[0] += 1;
                                            case "Iphone 16" ->
                                                stocks[1] += 1;
                                            case "Dyson Vacuum" ->
                                                stocks[2] += 1;
                                            case "Nike T-Shirt" ->
                                                stocks[3] += 1;
                                            case "Adidas sweater" ->
                                                stocks[4] += 1;
                                            case "Puma Sweatpants" ->
                                                stocks[5] += 1;
                                            case "Long couch" ->
                                                stocks[6] += 1;
                                            case "Dining set" ->
                                                stocks[7] += 1;
                                            case "Cushioned chair" ->
                                                stocks[8] += 1;
                                            case "Harry Potter series" ->
                                                stocks[9] += 1;
                                            case "Hunger Games" ->
                                                stocks[10] += 1;
                                            case "Lord of the Rings" ->
                                                stocks[11] += 1;
                                            case "Dune" ->
                                                stocks[12] += 1;
                                            default ->
                                                System.out.println("enter a valid cart number: 1 - " + cart.size());
                                        }
                                        cart.remove(removeint - 1);
                                    }
                                }
                            }
                            default -> System.out.println("Please enter a real product or option.");
                        }
                    }
                }
            }
        }
        System.out.println("Goodbye! Thank you for visiting TerrandiMart! Made by Andy Yu and Terrence Gu. ~ Code Exited");
        sc.close();
    }
}
