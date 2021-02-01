package geekbrains.lesson6;

public class Cat extends Animal{
    private String name;
    private String color;
    private final int maxRunDistance = 200 ;
    private final int maxSwimDistance = 0;

    public static int getCount() {
        return count;
    }

    private static int count;

    public Cat(String name, String color) {
        super(name, color);
        count++;
    }
    @Override
    public void run(int distance) {
        if(distance < this.maxRunDistance) {
            System.out.println(this.color + "кот/кошка по имени " + this.name + " пробежал " + distance + " метра/метров");
        }
        else {
            System.out.println(this.color + "кот/кошка по имени " + this.name + " не смог пробежать " + distance + " метра/метров");
        }
    }
    @Override
    public void swim(int distance){
        System.out.println("Коты не умеют плавать!:(");
    }

    @Override
    public  void voice(){
        System.out.println("Кот мяукает!!!");
    }

    @Override
    public void info() {
        System.out.println(this.color + " кошка по имени " + this.name);
    }
}
