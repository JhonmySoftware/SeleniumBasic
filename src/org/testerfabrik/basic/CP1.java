package org.testerfabrik.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CP1 {
    public static void main (String[] args){
    // Instanciar un objeto webdriver

        WebDriver driver;

    //Declarar las variables

        String baseURL = "https://www.choucairtesting.com/";
        String actualResult = "";
        String expectResult = "";
    //Indicar la localizacion del archivo crhomedriver.exe en la propiedad webdriver.chrome.driver
    //System.getProperty("user.dir") = c:\..\..\..\SeleniumBasic

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

    //Abrir el navegador chrome

        driver = new ChromeDriver();

    //Nevegar en la pagina indicada

        driver.get(baseURL);


    //Imprirmir Resultado

        System.out.println("Se accedio al sitio Correctamente");
        System.out.println("PRUEBA EXITOSA!!");

        driver.close();
    }



}
