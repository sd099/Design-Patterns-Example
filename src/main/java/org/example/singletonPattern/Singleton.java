package org.example.singletonPattern;
import java.util.Objects;

//create object even if no method called for this class
//public class Singleton {
//    static Singleton singleton = new Singleton();
//
//    private Singleton() {
//
//    }
//
//    public static Singleton getInstance() {
//        return singleton;
//    }
//}

//create object if only a method called for this class
public class Singleton {
    static Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (Objects.isNull(singleton)) {
            singleton = new Singleton();
        }
        return singleton;
    }
}