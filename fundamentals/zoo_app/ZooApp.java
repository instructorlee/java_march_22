import classes.Animal;

public class ZooApp {
    
    public static void main(String[] args) {
       
        lessonOne();
    }

    public static void lessonOne() {

        /*
            Classes
                - abstraction
                - blueprint
                - create discreet and easy to manage objects
                - 2 things
                    - attributes
                    - methods
        */

        Animal leo = new Animal("mammal", "lion", "Leo"); // instantiation
        Animal frankie = new Animal("amphibian", "frog", "Frankie");

        // breakpoint
        System.out.println("------------------");

        // Zoo is growing, increasing zookeepers from 1 to 3 ( overloading constructor )
        // defaults in other languages
        Animal petra = new Animal("bird", "parrot", "Petra", "Barney");

        System.out.println("------------------");

        petra.move("South");
        System.out.println(petra.getName());
        
        System.out.println(Animal.numberOfAnimals);
        
    }
}
