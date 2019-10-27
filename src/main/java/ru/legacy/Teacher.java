package ru.legacy;

public class Teacher extends User {
    String department;

    public Teacher(int id, String firstName, String secondName, String lastName, String phoneNumber, String department) {
        super(id, firstName, secondName, lastName, phoneNumber);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

