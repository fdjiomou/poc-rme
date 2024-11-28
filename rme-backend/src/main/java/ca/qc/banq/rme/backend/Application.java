/**
 * 
 */
package ca.qc.banq.rme.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author francis.djiomou
 *
 */
@EnableScheduling
@SpringBootApplication(scanBasePackages = "ca.qc.banq.rme")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
