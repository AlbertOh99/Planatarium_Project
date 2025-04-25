package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends ParentPOM{
    private WebDriverWait alertWait;

    @FindBy(id = "celestialTable")
    private List<WebElement> celestialTable;
    @FindBy(id = "locationSelect")
    private Select dropPM;
    @FindBy(id = "moonNameInput")
    private WebElement moonInput;
    @FindBy(id="orbitedPlanetInput")
    private WebElement planetIdInput;
    @FindBy(id = "moonImageInput")
    private WebElement moonImageInput;
    @FindBy(id = "planetNameInput")
    private WebElement planetInput;
    @FindBy(id = "planetImageInput")
    private WebElement planetImageInput;

    @FindBy(className = "submit-button")
    private WebElement submitButton;

    @FindBy(id = "deleteInput")
    private WebElement deleteInput;
    @FindBy(id = "deleteButton")
    private WebElement deleteButton;

    public HomePage(WebDriver driver, String title){
        super(driver, title);
    }
    public String getTitle(){
        return title;
    }
    public int getTableSize(){
        if(celestialTable.isEmpty()){
            return 0;
        }
        return celestialTable.get(0).findElement(By.tagName("tbody")).findElements(By.tagName("tr")).size();
    }
    public void waitForAlert(){alertWait.until(ExpectedConditions.alertIsPresent());}

    public void selectType(String type){
        // Need to recall the select due to it staling
        dropPM = new Select(driver.findElement(By.id("locationSelect")));
        dropPM.selectByVisibleText(type);
    }
    public void enterMoonName (String moonName){
        moonInput.sendKeys(moonName);
    }
    public void enterPlanetId (int id){
        planetIdInput.sendKeys(Integer.toString(id));
    }
    public void enterMoonImage(String location){
        // Since this is an optional input, it should not return an error
        if(!location.isEmpty()){
            moonImageInput.sendKeys(location);
        }
    }
    public void enterPlanetName(String moonName){
        planetInput.sendKeys(moonName);
    }
    public void enterPlanetImage(String location){
        // Since this is an optional input, it should not return an error
        if(!location.isEmpty()){
            planetImageInput.sendKeys(location);
        }
    }

    public List<WebElement> findNewRow(String name){
        List<WebElement> newRow = driver.findElements
                (By.xpath("//*[text()='" + name + "']"));
        return newRow;
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public void enterDeleteInput(String name){
        deleteInput.sendKeys(name);
    }

    public void clickDeleteButton(){
        deleteButton.click();
    }

    public boolean validateMoonInputs(){
        dropPM = new Select(driver.findElement(By.id("locationSelect")));
        return moonInput.isDisplayed()
                && moonImageInput.isDisplayed()
                && planetIdInput.isDisplayed()
                && dropPM.getFirstSelectedOption().getText().equals("Moon")
                && submitButton.getText().equals("Submit Moon");
    }


}
