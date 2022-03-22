package classes;

public class Bird extends Animal {
    
    public int numberOfEggs;
    
    public Bird(String type, String name, String zooKeeper, int numberOfEggs) {
        super("bird", type, name, zooKeeper);

        this.numberOfEggs = numberOfEggs;
    }
}
