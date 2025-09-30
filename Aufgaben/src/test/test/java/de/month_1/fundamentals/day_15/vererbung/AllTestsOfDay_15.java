package de.month_1.fundamentals.day_15.vererbung;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        HundTest.class,
        KannFliegenTest.class,
        VogelTest.class
})
public class AllTestsOfDay_15 {
}
