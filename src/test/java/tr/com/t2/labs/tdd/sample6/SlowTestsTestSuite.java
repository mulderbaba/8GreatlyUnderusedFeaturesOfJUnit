package tr.com.t2.labs.tdd.sample6;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by mertcaliskan
 * on 11/07/15.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTests.class)
@Suite.SuiteClasses(CategorizedTests.class)
public class SlowTestsTestSuite {
}
