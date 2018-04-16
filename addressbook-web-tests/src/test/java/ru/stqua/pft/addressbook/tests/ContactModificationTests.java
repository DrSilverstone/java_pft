package ru.stqua.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqua.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testGroupModification(){

        app.getNavigationHelper().gotoHomePage();

        if (! app.getContactHelper().isThereAContact()){

            // if we wont to check posibility to modify contact, but no contact exist, I'm create the contact

            app.getContactHelper().createContact(new ContactData("name", "surname", "company",
                    "444", "fff@v.ti", "test1"), true);
        }

        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().klickModify();

        app.getContactHelper().fillContactForm(new ContactData("updated", "updated", "updated",
                        "334", "fff@v.ti", null), false);

        app.getContactHelper().updateContact();
        app.getNavigationHelper().gotoHomePage();
            }
        }
