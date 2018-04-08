package ru.stqua.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqua.pft.addressbook.model.ContactData;
import ru.stqua.pft.addressbook.model.GroupData;

public class ContactDeletionTests  extends TestBase {

    @Test
    public void testGroupModification(){

        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().chooseContact();
        app.getContactHelper().deleteContact();

        /*
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("name", "surname", "company",
                "444", "fff@v.ti"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().gotoHomePage();
*/
    }
}


