package springboot_jenkins.springboot_jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsApplication {

	Logger logger= LoggerFactory.getLogger(SpringbootJenkinsApplication.class);

	public void print(){
		logger.info("application started..");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}
