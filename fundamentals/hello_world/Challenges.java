public class Challenges {
    
    public static void main(String[] args) {
        
        talkingRobot();
    }

    public static void talkingRobot() {

        // if temperature is greater than 50, print "The weather is nice today!"

        int temperature = 400;

        if ( temperature < 29 ) {
            System.out.println("It's cold out today");
        } else if ( temperature >= 30 && temperature <= 39 ) {
            System.out.println("It's a little chilly today");
        } else if ( temperature >= 40 && temperature <= 87 ) {
            System.out.println("the weather is nice today");
        } else if ( temperature >= 88 && temperature <= 100 ) {
            System.out.println("It's hot today");
        } else {
            System.out.println("Today's a scorcher");
        }

        /*
            Talking Temperature Gadget Conditional Statements Challenge

            update code to show additional messages
            "It's cold out today" < 29
            "It's a little chilly today" 30 - 39 degrees
            "the weather is nice today" 40 - 87
            "It's hot today" 88 - 100
            "Today's a scorcher" 101+
        */
    }

    public static void stopLights() {
        /*
            Stop Light Conditional Statements Challenge

            - build a stop light
                - 4 lights; red, yellow, green and white
                - 4 types of vehicles
                    - human powered ( human ) 
                        - can ONLY go if light is green
                    - personal/private transportation ( personal )
                        - can ONLY go if light is green or yellow
                        - must slow down to 20mph at yellow light
                    - public transportation
                        - can only go if light is white
                        - no need to slow down
                    - emergency vehicles
                        - can go on any light
                        - must slow down to 30 mph at yellow and white lights
                        - must slow down to 20 mph at red lights
        */

        int speed = 50;
        String vehicleType = "public";// human, personal, public, emergency
        String lightColor = "yellow";// green, yellow, red, white

        /* your code goes here */
        /* adjust the speed to pass the tests */
        
        // Ternary Operator
        System.out.printf(
            speed == 0 ? "The %s vehicle has stopped at a %s light.\n" : "The %s is driving through a %s light at %d mph.\n",
            vehicleType,
            lightColor,
            speed
        );
    }
}
