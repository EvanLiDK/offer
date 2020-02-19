package a02;


public class Hungry {

    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance(){

        return hungry;
    }
}
