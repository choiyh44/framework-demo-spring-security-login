/**
 * 
 */
package kr.co.ensmart.frameworkdemo;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2021. 12. 16.
 *
 */
@Slf4j
class PasswordEncoderAlgoTest {

    @Test
    void test() {
        String plainPassword = "testpassword";
        String encPassword;

        PasswordEncoder bCrypt = new BCryptPasswordEncoder();
        encPassword = bCrypt.encode(plainPassword);
        log.info("bCrypt.encode(): {}", encPassword);
        log.info("bCrypt.matches(): {}", bCrypt.matches(plainPassword, encPassword));

        encPassword = bCrypt.encode(plainPassword);
        log.info("bCrypt.encode(): {}", encPassword);
        log.info("bCrypt.matches(): {}", bCrypt.matches(plainPassword, encPassword));

        encPassword = bCrypt.encode(plainPassword);
        log.info("bCrypt.encode(): {}", encPassword);
        log.info("bCrypt.matches(): {}", bCrypt.matches(plainPassword, encPassword));

        PasswordEncoder standard = new StandardPasswordEncoder();
        encPassword = standard.encode(plainPassword);
        log.info("standard.encode(): {}", encPassword);
        log.info("standard.matches(): {}", standard.matches(plainPassword, encPassword));

        encPassword = standard.encode(plainPassword);
        log.info("standard.encode(): {}", encPassword);
        log.info("standard.matches(): {}", standard.matches(plainPassword, encPassword));

        encPassword = standard.encode(plainPassword);
        log.info("standard.encode(): {}", encPassword);
        log.info("standard.matches(): {}", standard.matches(plainPassword, encPassword));

        //return new MessageDigestPasswordEncoder("SHA-256");
        PasswordEncoder sha256 = new MessageDigestPasswordEncoder("SHA-256");
        encPassword = sha256.encode(plainPassword);
        log.info("sha256.encode(): {}", encPassword);
        log.info("sha256.matches(): {}", sha256.matches(plainPassword, encPassword));

        encPassword = sha256.encode(plainPassword);
        log.info("sha256.encode(): {}", encPassword);
        log.info("sha256.matches(): {}", sha256.matches(plainPassword, encPassword));

        encPassword = sha256.encode(plainPassword);
        log.info("sha256.encode(): {}", encPassword);
        log.info("sha256.matches(): {}", sha256.matches(plainPassword, encPassword));
}

}
