import java.util.*;
public class Storefront {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String exitswitch;
        double sum = 0;
        int[] stocks = {4, 10, 6, 5, 3, 7, 2, 1, 4, 11, 8, 9, 10}; // Stock per item
        ArrayList<String> cart = new ArrayList<>(); // Cart, add items
        boolean programloop = true;
        while (programloop) {
            boolean intialchoiceloop = true;
            boolean passwordloop = true;
            boolean menureset = true; // for the cart
            while (intialchoiceloop) {
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
                                String adminaction = sc.nextLine();
                                if (adminaction.equals("exit")) {
                                    adminloop = false;
                                    passwordloop = false;
                                } else {
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
                                    }
                                }

                            }
                        } else {
                            System.out.println("Incorrect. Please re-enter the password.");
                        }
                    }

                } else if (adminoruser.equals("user shopping")) {
                    intialchoiceloop = false;
                } else if(adminoruser.equals("exit")) {
                    intialchoiceloop = false;
                    programloop = false;
                    menureset = false;
                } else {
                    System.out.println("Please enter a correct option: Admin Menu, User Shopping, or Exit.");
                }
            }
            String add = ""; // universal holding variable
            while (menureset) {
                boolean CategoryError = true; //Defining error variable for checking if user states a correct product category.
                String category = ""; //Universal holding variable
                while (CategoryError) { // A loop to verify if the user queries a correct product category.
                    System.out.println("Choose a product category.");
                    System.out.println("Electronics\nClothing\nFurniture\nBooks");
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
                            System.out.println("4K Samsung Television: stock: " + stocks[0] + ". Price is $499.99");
                            System.out.println("Iphone 16: stock is " + stocks[1] + ". Price is $899.99");
                            System.out.println("Dyson Vacuum: stock is " + stocks[2] + ". Price is $78.50");
                        }
                        case "clothing" -> {
                            System.out.println("Nike T-Shirt: stock: " + stocks[3] + ". Price is $29.99");
                            System.out.println("Adidas Sweater: stock: " + stocks[4] + ". Price is $45.50");
                            System.out.println("Puma Sweatpants: stock: " + stocks[5] + ". Price is $16.50");
                        }
                        case "furniture" -> {
                            System.out.println("Long couch: stock: " + stocks[6] + ". Price is $899.99");
                            System.out.println("Dining Set: stock: " + stocks[7] + ". Price is $1094.50");
                            System.out.println("Cushioned chair: stock: " + stocks[8] + ". Price is $80.99");
                        }
                        default -> {
                            System.out.println("Harry Potter Series: stock: " + stocks[9] + ". Price is $24.99");
                            System.out.println("Hunger Games: stock: " + stocks[10] + ". Price is $10.00");
                            System.out.println("Lord Of The Rings: stock: " + stocks[11] + ". Price is $12.50");
                            System.out.println("Dune: stock: " + stocks[12] + ". Price is $8.50");
                        }
                    }

                    System.out.println("Enter item for purchase: (Type \"checkout\" to continue to checkout. Type \"Menu\" to go back)");
                    add = sc.nextLine().toLowerCase();
                    if (add.equals("menu")) {
                        System.out.println("returning to menu.");
                        break;
                    } else {
                        switch (add) {
                            case "4k samsung television" -> {
                                System.out.println("How many 4K Samsung Televisions?");
                                int amount = sc.nextInt();
                                if (stocks[0] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[0] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("4k Samsung Television");
                                    }
                                }
                            }
                            case "iphone 16" -> {
                                System.out.println("How many Iphone 16s?");
                                int amount = sc.nextInt();
                                if (stocks[1] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[1] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Iphone 16");
                                    }
                                }
                            }
                            case "dyson vacuum" -> {
                                System.out.println("How many Dyson Vacuums?");
                                int amount = sc.nextInt();
                                if (stocks[2] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[2] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Dyson Vacuum");
                                    }
                                }
                            }
                            case "nike t-shirt" -> {
                                System.out.println("How many Nike T-Shirts?");
                                int amount = sc.nextInt();
                                if (stocks[3] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[3] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Nike T-Shirt");
                                    }
                                }
                            }
                            case "adidas sweater" -> {
                                System.out.println("How many Adidas Sweaters?");
                                int amount = sc.nextInt();
                                if (stocks[4] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[4] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Adidas sweater");
                                    }
                                }
                            }
                            case "puma sweatpants" -> {
                                System.out.println("How many Puma Sweatpants?");
                                int amount = sc.nextInt();
                                if (stocks[5] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[5] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Puma Sweatpants");
                                    }
                                }
                            }
                            case "long couch" -> {
                                System.out.println("How many long couches?");
                                int amount = sc.nextInt();
                                if (stocks[6] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[6] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Long couch");
                                    }
                                }
                            }
                            case "dining set" -> {
                                System.out.println("How many Dining sets?");
                                int amount = sc.nextInt();
                                if (stocks[7] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[7] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Dining set");
                                    }
                                }
                            }
                            case "cushioned chair" -> {
                                System.out.println("How many Cushioned Chairs?");
                                int amount = sc.nextInt();
                                if (stocks[8] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[8] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Cushioned chair");
                                    }
                                }
                            }
                            case "harry potter series" -> {
                                System.out.println("How many harry potter series?");
                                int amount = sc.nextInt();
                                if (stocks[9] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[9] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Harry Potter series");
                                    }
                                }
                            }
                            case "hunger games" -> {
                                System.out.println("How many Hunger Games books?");
                                int amount = sc.nextInt();
                                if (stocks[10] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[10] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Hunger Games");
                                    }
                                }
                            }
                            case "lord of the rings" -> {
                                System.out.println("How many Lord of the Rings books?");
                                int amount = sc.nextInt();
                                if (stocks[11] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[11] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Lord of the Rings");
                                    }
                                }
                            }
                            case "dune" -> {
                                System.out.println("How many Dune books?");
                                int amount = sc.nextInt();
                                if (stocks[12] - amount < 0)
                                    System.out.println("Sorry, this product is sold out in that quantity. Please try again.");
                                else {
                                    stocks[12] -= amount;
                                    for (int i = 0; i < amount; i++) {
                                        cart.add("Dune");
                                    }
                                }
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
                                    }
                                    double total = sum; //just saving the total for later use.
                                    sum = 0;
                                    System.out.println("Enter product number to remove. Enter 0 to confirm the order!");
                                    int removeint = sc.nextInt();
                                    if(removeint == 0) {
                                        productloop = false;
                                        CartLoop = false;
                                        System.out.println("Order prepped! Type \"back\" to add more to your cart. Type \"complete\" to finalize your order.");
                                        sc.nextLine(); //clearing removeint's buffer, so exitswitch does not consume its buffer (empty line).
                                        exitswitch = sc.nextLine();
                                        if (exitswitch.toLowerCase().equals("complete")) {
                                            System.out.println("Thank you for purchasing! Order sent!");
                                            menureset = false;
                                            programloop = true;
                                        } else if(exitswitch.toLowerCase().equals("back")) {
                                            CartLoop = false;
                                        } else {
                                            System.out.println("Please choose a valid option.");
                                        }
                                    } else {
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
        System.out.println("goodbye. Code Exited");
        sc.close();
    }
}

