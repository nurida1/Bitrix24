package com.bitrix24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActionsPage extends BasePage{

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreButton;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[1]")
    public WebElement fileButton;

    @FindBy(xpath = "//div[@class='diskuf-uploader']")
    public WebElement uploadButton;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[3]/span[2]")
    public WebElement AnnouncementButton;

    @FindBy (xpath = "//*[@id=\"bx-b-mention-blogPostForm\"]")
    public WebElement MentionButton;



}
