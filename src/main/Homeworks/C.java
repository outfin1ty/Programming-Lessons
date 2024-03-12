package main.Homeworks;

public class C {
    public static void main(String[] argv) {
        Student a = new Student();
        Student b = new Student("Maxim", "max228", "114116118");
        Student c = new Student(19214, "Alex", "Shmith", "xdhsdn",
                    "01012001", "alex01@gmail.com");
        a.info();
        b.info();
        c.info();
    }
}
