package de.month_1.fundamentals.day_17.thissuper;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

@Suite
@SelectClasses({
        ThisSuperTasksTest.class,
        VogelSuperTest.class
})
public class AllTestsOfDay_17 {
}
