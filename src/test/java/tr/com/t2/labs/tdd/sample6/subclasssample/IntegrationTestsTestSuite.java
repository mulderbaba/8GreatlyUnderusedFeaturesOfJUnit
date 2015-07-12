package tr.com.t2.labs.tdd.sample6.subclasssample;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tr.com.t2.labs.tdd.sample6.SlowTests;

/**
 * Created by mertcaliskan
 * on 11/07/15.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTests.class)
@Suite.SuiteClasses(DatabaseTests.class)
public class IntegrationTestsTestSuite {
}
