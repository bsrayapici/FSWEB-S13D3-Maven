package org.example;

public class Person {

    String firstname;
    private final String lastName;
    int age;
    double grade;
    int id;
    boolean isTeen;


    // 1️⃣ 6 parametreli constructor
    public Person(String firstname, String lastName, int age, double grade, int id, boolean isTeen) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
        this.id = id;
        this.isTeen = isTeen;
    }

    // 2️⃣ 3 parametreli constructor → chaining
    public Person(String firstname, String lastName, int age) {
        this(firstname, lastName, age, 0, 0, true); // varsayılan değerlerle çağırıyor
    }

    public String getFirstName() {
        return this.firstname;
    }

    // 2. getLastName
    public String getLastName() {
        return this.lastName;
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

