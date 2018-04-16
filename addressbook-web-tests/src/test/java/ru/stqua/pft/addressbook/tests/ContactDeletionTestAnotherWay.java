package ru.stqua.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqua.pft.addressbook.model.ContactData;

public class ContactDeletionTestAnotherWay extends TestBase  {


    @Test
    public void testContactDeletionAnother(){

        app.getNavigationHelper().gotoHomePage();

        if (! app.getContactHelper().isThereAContact()){

                // if we wont to check posibility to delite contact, but no contact exist, I'm create the contact

            app.getContactHelper().createContact(new ContactData("name", "surname", "company",
                        "444", "fff@v.ti", "test1"), true);
        }

        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContactSecondType();
        app.getContactHelper().killAlert();
        app.getNavigationHelper().gotoHomePage();

        }
    }




