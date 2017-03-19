package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GradeSystemTest.class ,
		GradeTest.class,
		MainTest.class,
		NoSuchCommandExceptionTest.class,
		NoSuchIDExceptionTest.class ,
		UiTest.class
		})
public class RunAllTest {
}
