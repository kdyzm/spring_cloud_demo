package cloud.simple.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import com.netflix.turbine.streaming.servlet.TurbineStreamServlet;



@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableTurbine
public class TurbineApplication {
	/*
	 * http://localhost:8989/hystrix
	 * http://localhost:8989/turbine.stream?cluster=CLOUD-SIMPLE-UI
	 * 
	 * 
	 */
	public static void main(String[] args) {
		 SpringApplication.run(TurbineApplication.class, args);
		//boolean cloudEnvironment = new StandardEnvironment().acceptsProfiles("cloud");
		//new SpringApplicationBuilder(TurbineApplication.class).web(!cloudEnvironment).run(args);
	}
	
/*	@Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new TurbineStreamServlet(), "/turbine.stream");
    }*/
}
