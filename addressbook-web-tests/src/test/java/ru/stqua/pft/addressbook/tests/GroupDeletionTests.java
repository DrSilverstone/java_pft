package ru.stqua.pft.addressbook.tests;
import org.testng.annotations.Test;
import ru.stqua.pft.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase{
    
    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();

        if (! app.getGroupHelper().isThereAGroup()){

            // if we wont to check posibility to delite group, but no group exist, I'm create the group

            app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }
}