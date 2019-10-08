package com.xhw.logbacktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogbackTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogbackTestApplication.class, args);
	}

	private static final Logger logger = LoggerFactory.getLogger(LogbackTestApplication.class);

	@RequestMapping("send")
	public void send() {

		logger.info("info");
		int a=1;
		int b=0;
		System.out.println(a/b);
		logger.warn("warn");
		logger.error("error");
	}
}
