package ru.stqua.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqua.pft.addressbook.model.ContactData;


public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void chooseContact() {wd.findElement(By.xpath("//table[@id='maintable']//td[8]/a/img")).click();}
    //        wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();

    public void deleteContact(){wd.findElement(By.xpath("//div[@id='content']/form[2]/input[2]")).click();}

    public void updateContact(){wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();}

    public void fillContactForm(ContactData contactData) {

        type(By.name("firstname"), contactData.getName());
        type(By.name("lastname"), contactData.getSurname());
        type(By.name("company"), contactData.getCompany());
        type(By.name("mobile"), contactData.getPhoneNumber());
        type(By.name("email"), contactData.getEmail());
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void initContactCreation() { click(By.linkText("add new")); }

    //public void selectContact() {chouseElement();}

}
