import java.util.*;
public class HelloWorld {

    public static void main(String[] args) {

        /*
            Arrays
                - A fixed order list of same type data
                - can easily access any item in the list
                - immutable
        */

        String[] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(daysOfTheWeek);

        System.out.println(daysOfTheWeek[2]);

        daysOfTheWeek[4] = "Bon Jovi Friday!";
        daysOfTheWeek[5] = "FriYay!";

        for ( int x = 0; x < daysOfTheWeek.length; x ++ ) {
            System.out.println(daysOfTheWeek[x]);
        }

        System.out.println("------------------");

        String[] newDays = new String[daysOfTheWeek.length + 1];
        for ( int x = 0; x < daysOfTheWeek.length; x ++ )  newDays[x] = daysOfTheWeek[x];
        newDays[newDays.length - 1] = "NANDay"; // add the new item

        /* 
            ArrayList
                - similar to an Array
                - mutable
        */

        ArrayList<String>shoppingList = new ArrayList<String>();

        shoppingList.add("eggs");
        shoppingList.add("tortillas");
        shoppingList.add(1, "cheese"); // insert
        
        for ( String item: shoppingList) {
            System.out.println(item);
        }

        /*
            {
                "name": "Fred Flintstone",
                "age": "35",
                "profession": "Manager"
            }

            {
                "name": "Wilma Flintstone",
                "age": "42",
                "profession": "CEO"
            }
        */

        HashMap<String, String> userRecord = new HashMap<String, String>();
        userRecord.put("name", "Fred Flintstone");
        userRecord.put("age", "35");
        userRecord.put("profession", "manager");

        System.out.println(userRecord.get("age"));

        for(String key : userRecord.keySet()) {
            System.out.printf("%s: %s\n", key, userRecord.get(key));
        }

        /* 
           Array / ArrayList vs. HashMap
               - Arrays and ArrayLists for keeping an ordered list of items.
               - Hashmap for accessing specific information in the structure

               - Array and ArrayList keys are auto generated as numbers
               - Hashmap keys are assigned by the code and are usually numbers or string.
       */
        
       /*
            methods -
                - what?
                    - block of code that does one thing and does that one thing well
                - why?
                    - OOP design patterns we will cover next week
        */

        System.out.println("------------------");
        System.out.println("------------------");

        sayHello();

        // can receive and return data
        String flavor = "vanilla";
        System.out.printf(
            "Fred %s %s.\n", 
            checkIfLikesFlavor(flavor) ? "likes" : "doesn't like", 
            flavor
        );

        // overloading
        sayHello("Wilma");
    }

    public static void sayHello() {

        System.out.println("Hello");
    }

    public static void sayHello(String name) {
        System.out.printf("Hello %s! \n", name);
    }

    public static boolean checkIfLikesFlavor(String flavor) {
        return flavor == "chocolate";
    }

    public static void lessonOne() {

        
        System.out.println("Hello World!");
        System.out.println("------------------");

        /*

            - code is all about working with data. duh!

            - Java is strongly typed

            data types-

                - description of information being handled

                - benefits
                    - reduces runtime errors
                    - readability

                - technical
                    - affects how much memory is alloted and how it is organized
                        - https://www.w3schools.com/java/java_data_types.asp

                - all information can be reduced to a hand-full of data types and data structures

        */

        // type; camelCase; semi-colon
        int itemCount = 100;
        Double priceEach = 1.14;

        double subTotal = itemCount * priceEach;

        System.out.printf("%d * %f = %f\n", itemCount, priceEach, subTotal);
        System.out.println("------------------");

        boolean addTax = true;
        boolean isPremiumUser = true;
        int deliveryFee = 0;
        double total = subTotal;
        String purchaseMessage = "You bought %d items at %.2f for a total of %.2f\n";

        /*
            primitive types vs. object types
                - primitive types simply store a value. Your code has to handle any complex minipulation.
                - object types provide functionality to handle complex minipulation ( middleman )
                    - String vs. int
        */

        

        System.out.println("------------------");

        /*
            operators 
                - comparison operators
                    - == ( test if 2 values are equal !!! Don't confuse with "=" !!! )
                    - != ( test if 2 values are NOT equal !!1 read as "not equals" !!! )
                    - < ( test if first value is less second value )
                    - > ( test if first value is greater than second value )
                    - <= >= ( can combine them )
                    - % ( modulus - returns division remainder)

                // add after building basic if else statement
                - logical operators 
                    - &&
                    - ||
                    - !
        */

        if ( addTax == true ) total += total * .10;

        System.out.printf(purchaseMessage, itemCount, priceEach, total);
        System.out.println("------------------");

        if ( total <= 10 ) {
            deliveryFee = 15;
        } else if ( total >= 100 && ( addTax || isPremiumUser ) ) {
            deliveryFee = 5;
        } else if ( total <= 50 ) {
            deliveryFee = 10;
        } else {
            deliveryFee = 1;
        }

        // switch statement
        String animal = "dog";

        switch(animal) {
            case("dog"):
                System.out.println("arf arf");
            break;
            case("cat"):
                System.out.println("feed me! NOW!");
            break;
            case("pig"):
                System.out.println("oot oot");
            break;
        }

        System.out.printf("Your delivery fee is: %d", deliveryFee);
        System.out.println("------------------");

        // if total > 99 and user paid tax, deliverFee = 5
        // if total > 99, and either user paid tax or is a premiere user, delivery fee = 5

        // modulo - good for....
        System.out.println(10 % 2);
        System.out.println(10 % 4);

        System.out.println("------------------");

        // where to use it?
        int lineNumber = 3;

        System.out.printf(
            "%d is %s\n",
            lineNumber,
            lineNumber % 2 == 0 ? "even" : "odd" // Ternary
            );

        System.out.println("------------------");
    }
}