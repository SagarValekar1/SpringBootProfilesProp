package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class AppRunner implements CommandLineRunner {
	@Value("${my.data.code}")
	private String code;
	@Value("${my.data.code}")
	private String mode;
	
@Override
public void run(String... args) throws Exception {
	System.out.println(this);
	
}

@Override
public String toString() {
	return "AppRunnerABC [code=" + code + ", mode=" + mode + "]";
}

}
