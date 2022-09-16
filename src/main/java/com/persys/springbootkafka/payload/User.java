package com.persys.springbootkafka.payload;

public class User 
{   
    private int id;
    private String firstName;
    private String lastName;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }
    public String getlastName() {
        return lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public String toString() {
        return "User [firstname=" + firstName + ", id=" + id + ", lastName=" + lastName + "]";
    }

    
    
}
