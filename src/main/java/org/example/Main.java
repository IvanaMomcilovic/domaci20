package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*Napraviti maven projekat i dodati selenium dependency.
U Mainu preko selenijuma otici na https://demoqa.com/text-box.

Zadatak je da popunite sva polja (Full Name, email, Current Address, Permanent Address) i da kliknete submit.

Uporediti da li u rezultatu (ispod submit), full name i email su isti kao uneseni pre submita, da nije doslo do izmene.
 Upisati odgovarajucu poruku ako su isti ili ako se razlikuju podaci.

Zadatak okaciti na github.
*/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\IVANA\\KURS\\drajverZaSelenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");


        WebElement punoIme = driver.findElement(By.id("userName"));
        punoIme.sendKeys("Petar Petrovic");
        Thread.sleep(2000);

        WebElement mejl = driver.findElement(By.id("userEmail"));
        mejl.sendKeys("petar.petrovic@gmail.com");
        Thread.sleep(2000);

        WebElement trenutnaAdresa = driver.findElement(By.id("currentAddress"));
        trenutnaAdresa.sendKeys("Kralja Petra 1");
        Thread.sleep(2000);

        WebElement stalnaAdresa = driver.findElement(By.id("permanentAddress"));
        stalnaAdresa.sendKeys("Kralja Aleksandra 1");
        Thread.sleep(2000);

        WebElement submitDugme = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submitDugme.click();
        Thread.sleep(2000);

        String ocekivanoPunoIme = "Petar Petrovic";
        String stvarniRezultat = driver.findElement(By.xpath(//*[@id="name"]);


        if (ocekivanoPunoIme.equalsIgnoreCase(stvarniRezultat)) {
            System.out.println("Imena su ista!");
        } else {
            System.out.println("Imena nisu ista!");
        }

        String ocekivaniMejl = "petar.petrovic@gmail.com";
        String stvarniMejl = driver.findElement(By.xpath(//*[@id="email"]);

        if (ocekivaniMejl.equalsIgnoreCase(stvarniMejl)) {
            System.out.println("Mejlovi su isti!");
        } else {
            System.out.println("mejlovi nisu isti!");
        }


        driver.quit();
    }
}

