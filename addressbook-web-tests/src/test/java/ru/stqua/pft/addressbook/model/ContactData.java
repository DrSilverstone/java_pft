package ru.stqua.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String company;
    private final String mobile;
    private final String email;
    private String group;

    public ContactData(String name, String surname, String company, String phoneNumber, String email, String group) {
        this.firstname = name;
        this.lastname = surname;
        this.company = company;
        this.mobile = phoneNumber;
        this.email = email;
        this.group = group;
    }

    public String getName() {
        return firstname;
    }

    public String getSurname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public String getPhoneNumber() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }
}
