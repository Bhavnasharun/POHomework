package org.example;

import org.openqa.selenium.By;
//Q-6

public class ComputerPage extends Utils{
    public By _clickEmail = By.xpath("//button[text()='Email a friend']");
    public void ClickOnEmailToFriend(){
        clickOnElement(_clickEmail);
    }

}
