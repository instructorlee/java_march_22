package classes;

import interfaces.Fly;

public class Parrot extends Bird implements Fly{
    
    public Parrot(String name, String zooKeeper) {
        super("parrot", name, zooKeeper, 210);
    }
}
