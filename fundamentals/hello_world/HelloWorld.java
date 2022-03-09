public class HelloWorld {

    public static void main(String[] args) {
        
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
        double priceEach = 1.14;

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