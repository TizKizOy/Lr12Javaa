package org.shabCompany;

public class Meerkat {
    public String name;
    private int age;
    protected String habitat;
    boolean isFed;

    public Meerkat() {
        this.name = "Nameless";
        this.age = 0;
        this.habitat = "Savanna";
        this.isFed = false;
    }
    public Meerkat(String name, int age, String habitat, boolean isFed) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        this.isFed = isFed;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void eat() {
        if (!isFed) {
            System.out.println(name + " ест.");
            isFed = true;
        } else {
            System.out.println(name + " уже накормлен.");
        }
    }
    private void sleep() {
        System.out.println(name + " спит.");
    }
    protected void play() {
        System.out.println(name + " играет.");
    }
    void standOnHindLegs() {
        System.out.println(name + " стоит на задних лапах!");
    }
    public void goToSleep() {
        sleep();
    }

}
