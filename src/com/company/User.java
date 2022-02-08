package com.company;


public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String id;

   public User(){}

    public User(String firstName, String lastName, String email, String contactNumber, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.id = id;
    }



    public void introduce(String firstName, String lastName) {
        System.out.println("Hello my name is " + firstName + " " + lastName + ".");
    }

    public void provideContact(String email, String contactNumber, String id) {
        System.out.println("You may contact me at " + contactNumber + " or you may email me at " + email + ". ID: " + id);
    }

    public void setFirstName(String firstName){

        this.firstName = firstName;
    }

    public void setLastName(String lastName){

        this.lastName = lastName;
    }

    public void setEmail(String email){

        this.email = email;
    }

    public void setId(String id){
       this.id = id;

    }

    public void setContactNumber(String contactNumber){
       this.contactNumber = contactNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getId() {
        return id;
    }


}
