package cn.eovie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigclientApplication {

	@Value("${profile}")
	private String profile;

	@Value("${configserver.hi}")
	private String hi;

	@RequestMapping("/hello")
	public String getAppName() {
		return profile + "\n</br>\n" + hi;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}
}
