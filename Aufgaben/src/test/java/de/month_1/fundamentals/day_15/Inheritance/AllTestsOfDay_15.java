package de.month_1.fundamentals.day_15.Inheritance;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        DogTest.class,
        CanFlyTest.class,
        BirdTest.class
})
public class AllTestsOfDay_15 {
}
