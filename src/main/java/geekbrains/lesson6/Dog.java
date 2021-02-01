package geekbrains.lesson6;

public class Dog extends Animal {
    private String name;
    private String color;

    private final int maxRunDistance = 500 ;
    private final int maxSwimDistance = 10;

    public static int getCount() {
        return count;
    }

    private static int count;

    public Dog(String name, String color){
        super(name, color);
        count++;
    }


    @Override
    public void run(int distance) {
        if(distance < maxRunDistance) {
            System.out.println(this.color + " собака по имени " + this.name + " пробежал " + distance + " метра/метров");
        }
        else {
            System.out.println(this.color + " собака по имени " + this.name + " не смог пробежать " + distance + " метра/метров");
        }
    }

    @Override
    public void swim(int distance) {
        if(distance < maxSwimDistance) {
            System.out.println(this.color + " собака по имени " + this.name + " проплыл " + distance + " метра/метров");
        }
        else {
            System.out.println(this.color + " собака по имени " + this.name + " не смог проплыть " + distance + " метра/метров");
        }
    }

    @Override
    public void voice() {
        System.out.println("Собака гавкает!!!");
    }

    @Override
    public void info() {
        System.out.println("Собака по имени " + this.name + ", " + this.color + " цвета.");
    }
}
