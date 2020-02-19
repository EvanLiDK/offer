package a02;

public class Lazy {

    private volatile static Lazy lazy = null;


    public static Lazy getInstance() {
        if (lazy == null) {
            synchronized (Lazy.class) {
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }

        return lazy;
    }
}
