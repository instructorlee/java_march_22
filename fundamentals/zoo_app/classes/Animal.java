package classes;

public class Animal {

    public static int numberOfAnimals = 0;

    private String classification;
    private String name;
    private String type;

    private String zooKeeper = "Fred";

    private int energy = 50; // 0 - 100

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getClassification() {
        return this.classification;
    }

    public String getZookeeper() {
        return this.zooKeeper;
    }

    public void setZookeeper(String zookeeper) {
        this.zooKeeper = zookeeper;
    }

    public void setEnergy(int energy) {
        if ( energy > 100 ) energy = 100;

        this.energy = energy;
    }


    // constructor
    public Animal(String classification, String type, String name ) {

        this.name = name;
        this.type = type;
        this.classification = classification;

        Animal.numberOfAnimals ++;
    }

    // overload constructor
    public Animal(String classification, String type, String name, String zooKeeper) {

        this(classification, type, name);

        this.zooKeeper = zooKeeper;
    }

    public void move(String direction) {
        System.out.printf("%s is moving %s.\n", this.name, direction);
    }
}