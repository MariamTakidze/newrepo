package com.solvd.models;
import com.solvd.interfaces.IPerson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

import java.util.Objects;

public class Person implements IPerson {
    private static final Logger LOGGER = LogManager.getLogger(Person.class);
   protected   int id;

    protected String firstName;

     protected String lastName;

  protected  int age;
    String sex;
    //default const
    public Person() {
    }
    public Person(int id,String firstName,String lastName,int age, String sex) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;

    }
    //getters & setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id:" + id +
                ", firstName:'" + firstName + '\'' +
                ", lastName:'" + lastName + '\'' +
                ", age:" + age + '\'' +
                ", sex:" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age);
    }

    //====================
//    @Override
//    public void displayPersonInfo() {
//        System.out.println(
//                "Person{" +
//                ", firstName:'" + firstName + '\'' +
//                ", lastName:'" + lastName + '\'' +
//                ", sex:" + sex + '\'' +
//                        ", age:" + age + '\'' +
//                '}');
//    }

    @Override
    public Marker think() {
        LOGGER.info("I am able to think, therefore I exist.");
        return null;
    }

    @Override
    public Marker speak() {
        LOGGER.info("Speak Up");
        return null;
    }

    @Override
    public void displayPersonInfo(String firstName, String lastName, String sex, int age) {

    }
}
