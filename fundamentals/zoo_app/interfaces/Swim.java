package interfaces;

public interface Swim {
    
    public default void swim(String direction) {
        System.out.printf("swimming %s.\n", direction);
    }
}
