package oop_basics;
public class Main {
    public static void main (String[] args) {
        Person gochacha = new Person(120, "Gochacha");
//        gochacha.height = 120;
        gochacha.say("Pet9");
        System.out.println(gochacha.name + "\'s height is " + gochacha.height);
        Person vlad = new Person();
        System.out.println(vlad.height);

        Person dima = new Person("Dima");
        System.out.println(dima.name);
        System.out.println("");

        Student freshman = new Student(76, "Viktor", 2);
        freshman.tell();

        Student fresh = new Student(190, "Petruxa", 4);
        fresh.tell();
    }
}
