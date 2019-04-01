package com.lisanboot.helloBoot;

import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloBootApplicationTests {
	Logger logger = LoggerFactory.getLogger(HelloBootApplicationTests.class);
	@Test
	public void contextLoads() {
	}

	@Test
	public void testLog() {
		logger.trace("trace...");
		logger.debug("debug...");
		logger.info("info...");
		logger.warn("warn...");
		logger.error("error...");
	}

}
