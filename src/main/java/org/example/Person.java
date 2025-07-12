package org.example;

public class Person {

    String firstname;
    String lastname;
    int age;
    double grade;
    int id;
    boolean isTeen;

    // 1️⃣ 6 parametreli constructor
    public Person(String firstname, String lastname, int age, double grade, int id, boolean isTeen) {
        this.firstname = firstname;
        this.age = age;
        this.lastname = lastname;
        this.id = id;
        this.isTeen = isTeen;
        this.grade = grade;
    }

    // 2️⃣ 3 parametreli constructor → chaining
    public Person(String firstname, String lastname, int age) {
        this(firstname, lastname, age, 0, 0, 0); // varsayılan değerlerle çağırıyor
    }

    public String getFirstName() {
        return firstName;
    }

    // 2. getLastName
    public String getLastName() {
        return lastName;
    }

    // 3. getAge
    public int getAge() {
        return age;
    }

    // 4. isTeen
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}

