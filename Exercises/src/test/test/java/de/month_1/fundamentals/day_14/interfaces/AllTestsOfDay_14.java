package de.month_1.fundamentals.day_14.interfaces;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        AutoTest.class,
        FahrzeugTest.class
})
public class AllTestsOfDay_14 {
}
