package main.Homeworks;

public class Student {
    static int numberOfStudents;

    int id;
    String name;
    String lastName;
    String login;
    String password;
    String email;

    Student() {
        this.id = numberOfStudents++;
        this.name = "";
        this.lastName = "";
        this.login = "";
        this.password = "";
        this.email = "";
    }

    Student(int id, String name, String lastName, String login, String password, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    Student(String name, String login, String password) {
        this.id = numberOfStudents++;
        this.name = name;
        this.lastName = "";
        this.login = login;
        this.password = password;
        this.email = "";
    }

    public void info() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.lastName);
        System.out.println("login: " + this.login);
        System.out.println("password: " + this.password);
        System.out.println("email: " + this.email);
        System.out.println();
    }
}
