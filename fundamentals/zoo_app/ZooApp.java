import java.util.ArrayList;

import classes.Animal;
import classes.Bird;
import classes.Mammal;
import classes.Parrot;
import classes.PolarBear;

public class ZooApp {
    
    public static void main(String[] args) {
       
        //lessonOne();
        lessonTwo();
    }

    public static void lessonTwo() {

        Mammal paul = new Mammal("polar bear", "paul", "BamBam", 210);
        Bird polly = new Bird("parrot", "polly", "Betty", 2);

        System.out.println("----------");

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(paul);
        animals.add(polly);

        for( Animal animal : animals ) System.out.println(animal.getName());

        System.out.println("----------");

        PolarBear pam = new PolarBear("Pam", "Wilma");
        Parrot pollyTwo = new Parrot("polly two", "Fred");

        pam.swim("north");
        pam.walk("south");

        pam.move("East");
        pollyTwo.move("West");
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
