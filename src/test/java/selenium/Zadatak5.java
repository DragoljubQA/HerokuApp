package selenium;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Zadatak5 {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Yugo");
        cars.add("Fiat");
        cars.add("Audi");

        System.out.println("broj elemenata u listi je " + cars.size());
        System.out.println("poslednji element u listi je " + cars.get(cars.size()-1));

        cars.add("Renault");
        System.out.println("a sada broj elemenata u listi je " + cars.size());
        System.out.println("a sada poslednji element u listi je " + cars.get(cars.size()-1));
        System.out.println("-----------------");
        System.out.println("Cela lista je: ");
        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }



    }

}
