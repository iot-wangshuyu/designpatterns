package com.shuyu;

import com.shuyu.test.AbstractLogger;
import com.shuyu.test.LogTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChainresponsibilityApplicationTests {

	@Test
	public void contextLoads() {

		AbstractLogger loggerChain =LogTest.getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO,
				"This is an information.");

		loggerChain.logMessage(AbstractLogger.DEBUG,
				"This is an debug level information.");

		loggerChain.logMessage(AbstractLogger.ERROR,
				"This is an error information.");
	}

}
