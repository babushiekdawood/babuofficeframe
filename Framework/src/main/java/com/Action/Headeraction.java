package com.Action;

import com.UIobject.Header;
import com.googlecode.javacv.CanvasFrame;
import com.selenium.Propertyreader;
import org.openqa.selenium.WebDriver;
import com.toolbox.Element;

/**
 * Created by in.Babushaik on 8/4/2017.
 */
public class Headeraction extends Header {

    public Headeraction(WebDriver driver) {
        super(driver);
    }

    public boolean Clicklogin() {
        boolean clicklogin = false;
        try {

            Element.click(driver, Loginheaderbtn);
            clicklogin = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return clicklogin;
    }

    public boolean Loginpopupverify() {
        boolean loginpopupupverify = false;
        try {

            Element.click(driver, Loginpopupheading);
            loginpopupupverify = true;
        } catch (Exception e){
            System.out.println(e);
        }
        return loginpopupupverify;

    }

    public boolean LoginpopupLoginbtnclick() {
        boolean loginpopupLoginbtnclick = false;
        try {

            Element.click(driver, Loginbtn);
            loginpopupLoginbtnclick = true;
        } catch (Exception e){
            System.out.println(e);
        }
        return loginpopupLoginbtnclick;

    }
    public boolean Homepage() {
        boolean homepage = false;
        {
            try {


                Element.Verify(driver, Loginheaderbtn);
                homepage = true;
            } catch (Exception e) {
                System.out.println(e);
            }
            return homepage;

        }
    }

    public boolean EnterUsername(String uname) {
        boolean enterUsername = false;
        {
            try {

                Element.Entervalue(driver, Username, uname);


                enterUsername = true;
            } catch (Exception e) {
                System.out.println(e);
            }
            return enterUsername;

        }
    }
    public boolean EnterPassword(String Pass) {
        boolean enterPassword = false;
        {
            try {

                Element.Entervalue(driver, password, Pass);

                enterPassword = true;
            } catch (Exception e) {
                System.out.println(e);
            }
            return enterPassword;

        }
    }}
