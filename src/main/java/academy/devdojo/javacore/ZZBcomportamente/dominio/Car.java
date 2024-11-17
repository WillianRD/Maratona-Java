package academy.devdojo.javacore.ZZBcomportamente.dominio;

public class Car {
    private String marca,name = "audi";
    private String color;
    private int year;

    public Car(String marca, String name, String color, int year) {
        this.marca = marca;
        this.name = name;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public String getMarca(){
        return marca;
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }



}
