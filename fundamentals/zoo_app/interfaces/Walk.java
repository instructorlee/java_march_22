package interfaces;

public interface Walk {
    
    public default void walk(String direction) {
        System.out.printf("walking %s.\n", direction);
    }
}
