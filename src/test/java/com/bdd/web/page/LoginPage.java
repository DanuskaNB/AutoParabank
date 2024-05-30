package com.bdd.web.page;

import com.bdd.FrontEnd.BaseClass;
import com.bdd.FrontEnd.Hook;
import com.bdd.FrontEnd.utility.ExtentReportUtil;
import com.bdd.FrontEnd.utility.GenerateWord;
import com.bdd.web.model.ExcelModel;
import com.bdd.web.path.LoginPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends BaseClass {

    private WebDriver driver;
    static GenerateWord generateWord = new GenerateWord();

    public LoginPage() {
        driver = Hook.getDriver();
    }


    public void DeQueIngresoALaPagina(String IDTest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDTest) - 1;
            String url = getData().get(valor).get(ExcelModel.URL);
            driver.get(url);
            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente a la página Paranbak");
            generateWord.sendText("Se inició correctamente a la página Paranbak");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
            throw e;
        }
    }

    public void ingresarFirstName(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_FIRST_NAME);
            sendKeyValue(driver, "xpath", LoginPath.txt_FirstName, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa el dato del FirstName: " + documentoData);
            generateWord.sendText("Se ingresa el dato del FirstName: " + documentoData);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    public void ingresarLastName(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_LAST_NAME);
            sendKeyValue(driver, "xpath", LoginPath.txt_LastName, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa el dato del LastName : " + documentoData);
            generateWord.sendText("Se ingresa el dato del LastName: " + documentoData);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    public void ingresarAddress(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_ADDRESS);
            sendKeyValue(driver, "xpath", LoginPath.txt_Address, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa el dato del Address: " + documentoData);
            generateWord.sendText("Se ingresa el dato del Address: " + documentoData);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    public void ingresarCity(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_CITY);
            sendKeyValue(driver, "xpath", LoginPath.txt_City, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa el dato del City : " + documentoData);
            generateWord.sendText("Se ingresa el dato del City : " + documentoData);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    public void ingresarState(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_STATE);
            sendKeyValue(driver, "xpath", LoginPath.txt_State, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa el dato del State: " + documentoData);
            generateWord.sendText("Se ingresa el dato del State: " + documentoData);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    public void ingresarZipCode(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_ZIP_CODE);
            sendKeyValue(driver, "xpath", LoginPath.txt_ZipCode, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa el dato del ZipCode: " + documentoData);
            generateWord.sendText("Se ingresa el dato del ZipCode: " + documentoData);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    public void ingresarPhone(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_PHONE);
            sendKeyValue(driver, "xpath", LoginPath.txt_Phone, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa el dato del Phone: " + documentoData);
            generateWord.sendText("Se ingresa el dato del Phone: " + documentoData);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }public void ingresarSsn(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_SSN);
            sendKeyValue(driver, "xpath", LoginPath.txt_Ssn, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa el dato del Ssn: " + documentoData);
            generateWord.sendText("Se ingresa el dato del Ssn: " + documentoData);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }public void ingresarUsername(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_USERNAME);
            sendKeyValue(driver, "xpath", LoginPath.txt_Username, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa el dato del : " + documentoData);
            generateWord.sendText("Se ingresa el dato del : " + documentoData);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    public void ingresarPassword(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_PASSWORD);
            sendKeyValue(driver, "xpath", LoginPath.txt_Password, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa la contraseña");
            generateWord.sendText("Se ingresa la contraseña");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }


    public void ingresarConform(String   IDTest) throws Throwable {
        try {

            int valor = Integer.parseInt(IDTest) - 1;
            String passwordData = getData().get(valor).get(ExcelModel.COLUMNA_CONFIRM);

            sendKeyValue(driver, "xpath", LoginPath.txt_Confirm, passwordData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa nuevamente la contraseña");
            generateWord.sendText("Se ingresa nuevamente la contraseña");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }

    public void seleccionoElBotonRegistrar() throws Throwable {
        try {
            sleep(3000);
            click(driver, "xpath", LoginPath.btn_Registrar);
        } catch (Exception e) {
            driver.close();
        }
    }
    public void validamoselMensaje() throws Throwable{
        try {
         List<WebElement> message= driver.findElements(By.xpath("//*[@id=\"rightPanel\"]/p"));
        sleep(3000);
        ExtentReportUtil.INSTANCE.stepPass(driver, "Se valida el mensaje");
        generateWord.sendText("Se valida el mensaje");
        generateWord.addImageToWord(driver);
    } catch (Exception e) {
        ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
        generateWord.sendText("Tiempo de espera ha excedido");
        generateWord.addImageToWord(driver);
        driver.close();
    }
    }

    public void seleccionoElBotonRegister() throws Throwable {
        try {
            sleep(3000);
            click(driver, "xpath", LoginPath.btn_Register);
        } catch (Exception e) {
            driver.close();
        }
    }
    public void ingresarUsername2(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_USERNAME);
            sendKeyValue(driver, "xpath", LoginPath.txt_Username2, documentoData);
            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "SSe ingresa el dato del username: " + documentoData);
            generateWord.sendText("Se ingresa el dato del username: " + documentoData);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    public void ingresarPassword2(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_PASSWORD);
            sendKeyValue(driver, "xpath", LoginPath.txt_Password2, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa el  password: ");
            generateWord.sendText("Se ingresa el  password: ");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    public void SeleccionoElBotonIngresar() throws Throwable {
        try {
            sleep(3000);
            click(driver, "xpath", LoginPath.btn_Ingresar);
        } catch (Exception e) {
            driver.close();
        }
    }

    public void ValidamosLaPantallaDeInicio() throws Throwable {
        driver.close();
    }















}
