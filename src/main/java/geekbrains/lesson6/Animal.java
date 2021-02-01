package geekbrains.lesson6;

import java.security.PublicKey;

public abstract class Animal {
    String name;
    String color;
    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void swim(int distance);
    
    public abstract void run(int distance);
    
    public abstract void voice();
    
    public abstract void info();


}
