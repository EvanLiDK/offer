package a02;
/**
 * 实现Singleton
 * 三种方式静态内部类
 * 饿汉式
 * 双重检查锁懒汉式
 */
public class Func {


    public static final Func getInstance (){

        return LazyHolder.LAZY;
    }

    private static class LazyHolder{

        private static  final Func LAZY = new Func();
    }

}
