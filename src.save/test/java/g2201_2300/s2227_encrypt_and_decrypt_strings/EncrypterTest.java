package g2201_2300.s2227_encrypt_and_decrypt_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class EncrypterTest {
    @Test
    void encrypterTest() {
        Encrypter encrypter =
                new Encrypter(
                        new char[] {'a', 'b', 'c', 'd'},
                        new String[] {"ei", "zf", "ei", "am"},
                        new String[] {
                            "abcd", "acbd", "adbc", "badc", "dacb", "cadb", "cbda", "abad"
                        });
        assertThat(encrypter.encrypt("abcd"), equalTo("eizfeiam"));
        assertThat(encrypter.decrypt("eizfeiam"), equalTo(2));
    }
}
