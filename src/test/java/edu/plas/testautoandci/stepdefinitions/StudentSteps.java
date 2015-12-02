package edu.plas.testautoandci.stepdefinitions;

import cucumber.api.java.en.Then;
import edu.plas.testautoandci.driver.Driver;
import edu.plas.testautoandci.pageobjectmodels.StudentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by waylon on 26/11/2015.
 */
public class StudentSteps {

    StudentPage page = new StudentPage();

    @Then("^there are '(\\d+)' students$")
    public void assertStudentList(int studentCount) {
        assertEquals(page.getStudentCount(), studentCount);
    }

    @Then("^students have no details missing$")
    public void assertStudentDetails() {
        List<WebElement> studentList = page.getStudentList();

        for (WebElement student : studentList) {
            assertFalse("".equals(page.getIdFromStudent(student)));
            assertFalse("".equals(page.getFirstNameFromStudent(student)));
            assertFalse("".equals(page.getLastNameFromStudent(student)));
            assertFalse("".equals(page.getCountryFromStudent(student)));
            assertFalse("".equals(page.getMobileFromStudent(student)));
        }
    }

    @Then("^there are '(\\d+)' students named '(.*)'$")
    public void assertStudentFirstName(int studentCount, String firstName) {
        assertEquals(page.getStudentCountByFirstName(firstName), studentCount);
    }

    @Then("^there are at least '(\\d+)' students from '(.*)'$")
    public void assertStudentCountry(int studentCount, String country) {
        assertTrue(page.getStudentCountByCountry(country) >= studentCount);
    }

    @Then("^there are '(\\d+)' students from '(.*)'$")
    public void assertNoStudentCountry(int studentCount, String country) {
        assertTrue(page.getStudentCountByCountry(country) == studentCount);
    }

    @Then("^all mobile numbers are numeric$")
    public void assertMobileNumbersNumeric() {
        List<String> mobileList = page.getMobilesOfStudents();
        for (String mobile : mobileList) {
            assertTrue(mobile.matches("\\d+"));
        }
    }
}
