package web.model;

public class Car {
    private String mark;
    private String color;
    private int age;

    public Car(String mark, String color, int age) {
        this.mark = mark;
        this.color = color;
        this.age = age;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car model: " + mark +
                ", Car color: " + color +
                ", Car age: " + age;
    }
}
