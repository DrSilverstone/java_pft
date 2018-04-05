package ru.stqua.pft.addressbook;

public class ContactData {
    private final String name;
    private final String surname;
    private final String company;
    private final String phoneNumber;
    private final String email;

    public ContactData(String name, String surname, String company, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
