package com.bdd.FrontEnd;

import com.bdd.FrontEnd.exceptions.FrontEndException;
import com.bdd.FrontEnd.utility.ExtentReportUtil;
import com.bdd.FrontEnd.utility.GenerateWord;
import com.bdd.FrontEnd.utility.ExcelReader;
import com.bdd.FrontEnd.utility.Sleeper;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.*;


public class BaseClass {

    public static WebDriver driver;
    public BaseClass() {driver = Hook.getDriver();}

    private static final String EXCEL_WEB = "excel/DATA.xlsx";
    private static final String EXCEL_SHEET = "Data";

    public static List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(EXCEL_WEB, EXCEL_SHEET);
    }

    static GenerateWord generateWord = new GenerateWord();


    public static void sendKeyValue(WebDriver driver, String key, String locator, String value) throws Throwable {
        try {

            switch (key.toLowerCase()) {

                case "id":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.id(locator))).sendKeys(value);
                    break;

                case "name":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.name(locator))).sendKeys(value);
                    break;

                case "css":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator))).sendKeys(value);
                    break;

                case "linktext":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.linkText(locator))).sendKeys(value);
                    break;

                case "xpath":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).sendKeys(value);
                    break;
            }

        } catch (Throwable t) {

            generateWord.sendText("No se encontró el elemento : " + locator);

            generateWord.addImageToWord(driver);

            handleError(driver, "", "No se encontro el elemento : " + locator);

            driver.close();

            throw t;
        }
    }

    public static void click(WebDriver driver, String key, String locator) throws Throwable {
        try {

            switch (key.toLowerCase()) {

                case "id":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.id(locator))).click();
                    break;

                case "name":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.name(locator))).click();
                    break;

                case "css":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator))).click();
                    break;

                case "linktext":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.linkText(locator))).click();
                    break;

                case "xpath":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
                    break;

            }

        } catch (Throwable t) {

            generateWord.sendText("Error : No se encontró el elemento : " + locator);

            generateWord.addImageToWord(driver);

            handleError(driver, "", "No se encontro el elemento : " + locator);

            driver.close();

            throw t;
        }
    }


    public static Exception handleError(WebDriver driver, String codigo, String msg) throws Throwable {
        stepWarning(driver, msg);
        System.out.println(msg);
        return new FrontEndException(StringUtils.trimToEmpty(codigo), msg);
    }


    public static String getText(WebDriver driver, String key, String locator) throws Throwable {
        try{
            WebElement webElement = null;
            switch (key.toLowerCase()) {
                case "id":
                    webElement = driver.findElement(By.id(locator));
                    break;
                case "name":
                    webElement = driver.findElement(By.name(locator));
                    break;
                case "css":
                    webElement = driver.findElement(By.cssSelector(locator));
                    break;
                case "linktext":
                    webElement = driver.findElement(By.linkText(locator));
                    break;
                case "xpath":
                    webElement = driver.findElement(By.xpath(locator));
                    break;
                default:
                    new FrontEndException("BC-005", "No se encontro :" + webElement);
            }
            return StringUtils.trimToEmpty(webElement.getText());

        }catch (Throwable t){
            generateWord.sendText("No se encontró el elemento : " + locator);
            generateWord.addImageToWord(driver);
            handleError(driver, "", "No se encontro el elemento : " + locator);
            throw t;
        }
    }

    public static void sleep(int milisegundos) {
        Sleeper.Sleep(milisegundos);
    }

    public static void stepPass(WebDriver driver, String descripcion) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepPass(driver, descripcion);
        } catch (Throwable t) {
            System.out.println(t.getStackTrace());
            throw t;
        }
    }

    public static void stepWarning(WebDriver driver, String descripcion) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepWarning(driver, descripcion);
        } catch (Throwable t) {
            System.out.println(t.getStackTrace());
            throw t;
        }
    }

    public static void stepFailNoShoot(String descripcion) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepFailNoShoot(descripcion);
        }catch (Throwable t){
            System.out.println(Arrays.toString(t.getStackTrace()));
            throw t;
        }
    }


    public static void wait(int milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public static void mensajeImprimirWord(WebDriver driver,String mensajePersonalisado){
        try {
            generateWord.sendText(mensajePersonalisado);
            generateWord.addImageToWord(driver);
        }catch (Exception t){
            generateWord.sendText("Error al imprimir en el word");
            generateWord.addImageToWord(driver);
            driver.close();
            throw t;
        }
    }

}

