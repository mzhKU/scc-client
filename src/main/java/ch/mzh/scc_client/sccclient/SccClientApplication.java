package ch.mzh.scc_client.sccclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController
@Slf4j
public class SccClientApplication {

	@Value("${app-url:DEFAULT_URL}")
	private String appURL;

	public static void main(String[] args) {
		SpringApplication.run(SccClientApplication.class, args);
	}

	@RequestMapping("/url")
	public void logURL() {
		log.info("----------------------------------------");
		log.info(appURL);
		log.info("----------------------------------------");
	}
}
