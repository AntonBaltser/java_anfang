package oop_basics;

public class Main {
    public static void main (String[] args) {
        Person gochacha = new Person();
        gochacha.height = 120;
        gochacha.say("Pet9");
        System.out.println(gochacha.height);
        Person vlad = new Person();
        System.out.println(vlad.height);
    }
}
