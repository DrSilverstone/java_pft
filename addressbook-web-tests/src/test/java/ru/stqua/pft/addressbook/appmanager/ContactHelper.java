package ru.stqua.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqua.pft.addressbook.model.ContactData;


public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void klickModify() {wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]")).click();}


    public void deleteContact() {wd.findElement(By.xpath("//div[@id='content']/form[2]/input[2]")).click();}

    public void updateContact() {wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();}

    public void selectContact() { click(By.name("selected[]")); }

    public void deleteContactSecondType() {wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();}

    public void killAlert() {wd.switchTo().alert().accept();}


    public void fillContactForm(ContactData contactData, boolean creation) {

        type(By.name("firstname"), contactData.getName());
        type(By.name("lastname"), contactData.getSurname());
        type(By.name("company"), contactData.getCompany());
        type(By.name("mobile"), contactData.getPhoneNumber());
        type(By.name("email"), contactData.getEmail());

        if(creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse( isElementPresent(By.name("new_group")));
        }
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void initContactCreation() { click(By.linkText("add new")); }

    public void createContact(ContactData contact, boolean creation) {

        initContactCreation();
        fillContactForm(contact, creation);
        submitContactCreation();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.xpath("//table[@id='maintable']//td[8]/a/img"));
    }
}















