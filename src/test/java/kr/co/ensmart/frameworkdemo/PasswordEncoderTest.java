package kr.co.ensmart.frameworkdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest()
class PasswordEncoderTest {
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	void test() {
	    String plainPassword = "testpassword";

	    String encPassword = passwordEncoder.encode(plainPassword);
		log.info("encPassword: {}", encPassword);
        log.info("passwordEncoder.matches(): {}", passwordEncoder.matches(plainPassword, encPassword));

	}

}
