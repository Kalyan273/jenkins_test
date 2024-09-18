package springboot_jenkins.springboot_jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsApplication {

	public  static Logger logger= LoggerFactory.getLogger(SpringbootJenkinsApplication.class);

	@PostConstruct
	public void print(){
		logger.info("application started..");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}
