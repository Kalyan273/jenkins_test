package springboot_jenkins.springboot_jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootJenkinsApplicationTests {
	public  static Logger logger= LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing..");
		logger.info("Test case executing 2nd time..");
		logger.info("Test case executing 3rd time..");
		assertEquals(true, true);
	}

}
