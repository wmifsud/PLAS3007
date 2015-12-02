package edu.plas.testautoandci.pageobjectmodels;

import edu.plas.testautoandci.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by waylon on 26/11/2015.
 */
public class StudentPage extends DriverPage {

    private List<WebElement> getElementList(By by) {
        return Driver.getWebDriver().findElements(by);
    }

    public int getStudentCount() {
        return getStudentList().size();
    }

    public List<WebElement> getStudentList() {
        return getElementList(By.cssSelector("[id^='student']"));
    }

    public String getIdFromStudent(WebElement student) {
        return student.findElement(By.id("st_id")).getText();
    }

    public String getFirstNameFromStudent(WebElement student) {
        return student.findElement(By.id("st_firstname")).getText();
    }

    public String getLastNameFromStudent(WebElement student) {
        return student.findElement(By.id("st_lastname")).getText();
    }

    public String getCountryFromStudent(WebElement student) {
        return student.findElement(By.id("st_country")).getText();
    }

    public String getMobileFromStudent(WebElement student) {
        return student.findElement(By.id("st_mobile")).getText();
    }

    public int getStudentCountByFirstName(String firstName) {
        int i = 0;
        List<WebElement> studentList = getStudentList();
        for (WebElement student : studentList) {
            if (getFirstNameFromStudent(student).equals(firstName)) {
                i++;
            }
        }
        return i;
    }

    public int getStudentCountByCountry(String country) {
        int i = 0;
        List<WebElement> studentList = getStudentList();
        for (WebElement student : studentList) {
            if (getCountryFromStudent(student).equals(country)) {
                i++;
            }
        }
        return i;
    }

    public List<String> getMobilesOfStudents() {
        List<String> mobileList = new ArrayList<>();
        List<WebElement> studentList = getStudentList();
        for (WebElement student : studentList ) {
            mobileList.add(getMobileFromStudent(student));
        }
        return mobileList;
    }
}
