package ru.legacy;

public class Student extends User {
    private String group;

    public Student(int id, String firstName, String secondName, String lastName, String phoneNumber, String group) {
        super(id, firstName, secondName, lastName, phoneNumber);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }
}
