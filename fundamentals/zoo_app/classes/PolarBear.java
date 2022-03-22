package classes;

import interfaces.*;

public class PolarBear extends Mammal implements Swim, Walk {
    
    public PolarBear(String name, String zooKeeper) {
        super("polar bear", name, zooKeeper, 210);
    }

    @Override
    public void move(String direction) {
        System.out.printf("%s is galloping %s.\n", this.getName(), direction);
    }
}
