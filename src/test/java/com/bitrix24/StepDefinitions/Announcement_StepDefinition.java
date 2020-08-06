package com.bitrix24.StepDefinitions;

import com.bitrix24.pages.ActionsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Announcement_StepDefinition {
    ActionsPage actionsPage = new ActionsPage();


    @Then("User should be able to click on More button")
    public void userShouldBeAbleToClickOnMoreButton() throws InterruptedException {

        actionsPage.moreButton.click();
        Thread.sleep(2000);

    }

    @Then("User should be able to click on Announcement button")
    public void userShouldBeAbleToClickOnAnnouncementButton() throws InterruptedException {
        actionsPage.AnnouncementButton.click();
        Thread.sleep(2000);




    }

    @Then("User should be able to click on Mention button")
    public void userShouldBeAbleToClickOnMentionButton() throws InterruptedException {
        actionsPage.MentionButton.click();
        Thread.sleep(2000);


    }

    @Then("User should be able to add a mention person")
    public void userShouldBeAbleToAddAMention() {
    }

    @And("User should be able to send the Announcement")
    public void userShouldBeAbleToSendTheAnnouncement() {
    }
}
