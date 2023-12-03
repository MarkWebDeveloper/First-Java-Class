package dev.mark;

public class Person {

    public String name;
    
    public String surname;

    public Number idNumber;

    public Number yearOfBirth;

    public Person(String name, String sur, Number id, Number year) {
        this.name = name;
        this.surname = sur;
        this.idNumber = id;
        this.yearOfBirth = year;
    }

    public void printPersonInfo() {
        System.out.println("Name: " + this.name + "\n" + "Surname: " + this.surname + "\n" + "ID Number: " + this.idNumber + "\n" + "Year of birth: " + this.yearOfBirth);
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void printNameReversed() {
    //     System.out.println("print desde método NameReversed");
    // }

    // public String removeVocals() {
    //     return name;
    // }

}