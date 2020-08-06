@Announcement
Feature: Bitrix search feature
  As a user, I should be able to send Announcement from Annoucement subheadding from "More" under Activity Stream.

  Given User is on the login page
  Scenario: Verification that user is able to send Announcement from Annoucement subheadding
    When  User enters credentials on login page
    Then  User should be able to click on More button
    Then  User should be able to click on Announcement button
    Then  User should be able to click on Mention button
    Then User should be able to add a mention person
    And   User should be able to send the Announcement


   # "1. User should be able to click on upload files icon to upload files and pictures from local disks,
   # download from external drive, select documents from bixtrix24, and create files to upload.
  # 2. User should be able to add users and recipients from selecting contact from E-mail user,
  # Employees and Departments and Recent contact lists.
  #3. User should be able to attach link by clicking on the link icon.
  #4. User should be able to insert videos by clicking on the video icon and entering the video URL.
  #5. User should be able to create a quote by clicking on the Comma icon.
  #6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
  #7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
  #8. User should be able to click on the Topic icon to see the annoucement Topic text box displays on top of the message box.
  #9. User should be able to click on ""Record Video"" tab to record a video and attach it with the message.
  #10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon."





