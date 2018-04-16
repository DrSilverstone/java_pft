package ru.stqua.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqua.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testGroupModification(){

        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().chooseContact();

        app.getContactHelper().fillContactForm(new ContactData("update", "surname", "company",
                        "444", "fff@v.ti", null), false);

        app.getContactHelper().updateContact();
        app.getNavigationHelper().gotoHomePage();
            }
        }
