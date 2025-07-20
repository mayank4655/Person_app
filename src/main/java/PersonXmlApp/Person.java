package PersonXmlApp;

import java.util.List;

public class Person {
    public String name;
    public int age;
    public double balanceAmount;
    public List<String> interests;

    public Person() {}

    public Person(String name, int age, double balanceAmount, List<String> interests) {
        this.name = name;
        this.age = age;
        this.balanceAmount = balanceAmount;
        this.interests = interests;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + balanceAmount + ", " + interests;
    }
}
