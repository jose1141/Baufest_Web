package com.BaufestWeb.bdd.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Common {

    private static void waitABit(long milliSec) {
        try {
            Thread.sleep(milliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void setText(WebElement ele, String text) {
        ele.clear();
        ele.sendKeys(text);
        waitABit(200);
    }


}
