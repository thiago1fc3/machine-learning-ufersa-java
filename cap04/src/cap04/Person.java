package cap04;

public class Person {

    private double height;
    private double weight;
    private int sex;

    public Person(double height, double weight, int sex) {
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    public Person(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }


    public int getSex() {
        return sex;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

}
