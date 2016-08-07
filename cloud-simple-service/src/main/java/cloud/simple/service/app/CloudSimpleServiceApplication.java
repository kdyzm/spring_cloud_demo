package cloud.simple.service.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"cloud.simple"})
public class CloudSimpleServiceApplication {
	private static Logger logger=LoggerFactory.getLogger(CloudSimpleServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CloudSimpleServiceApplication.class, args);
		logger.info("cloud simple service init successful !");
	}
}
