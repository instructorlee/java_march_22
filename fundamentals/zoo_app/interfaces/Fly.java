package interfaces;


public interface Fly {

    public default void fly(String direction) {
        System.out.printf("flying %s.\n", direction);
    }
}
