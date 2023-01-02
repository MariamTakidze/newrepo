package com.solvd.reflection;



public class ReflectionPerson {
    private final String firstName;
    private final String lastName;
    private int age;

    public ReflectionPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void think(){
        System.out.println("think");
    }

    private void speak(){
        System.out.println("speak");
    }

    private static void help(){
        System.out.println("Do you need my help?");
    }
    public String goodbye( String crushname){
        return "Goodbye" + crushname + "It's 2023 now";
    }
}
