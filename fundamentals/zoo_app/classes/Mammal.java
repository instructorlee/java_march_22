package classes;

public class Mammal extends Animal {

    public int gestationPeriod; // days


    
    public Mammal(String type, String name, String zooKeeper, int gestationPeriod) {
        super("mammal", type, name, zooKeeper);

        this.gestationPeriod = gestationPeriod;
    }
}
