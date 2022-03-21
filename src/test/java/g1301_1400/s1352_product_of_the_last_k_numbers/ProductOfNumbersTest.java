package g1301_1400.s1352_product_of_the_last_k_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class ProductOfNumbersTest {
    @Test
    void productOfNumbersTest() {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(5);
        productOfNumbers.add(4);
        assertThat(productOfNumbers.getProduct(2), equalTo(20));
        assertThat(productOfNumbers.getProduct(3), equalTo(40));
        assertThat(productOfNumbers.getProduct(4), equalTo(0));
        productOfNumbers.add(8);
        assertThat(productOfNumbers.getProduct(2), equalTo(32));
    }
}
