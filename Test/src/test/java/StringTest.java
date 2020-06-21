import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {

    @Test
    public void test_sting() {
        String text = "abc";
//        assert text.equals("abc");
//        Assert.assertEquals("abc", text); // dazniausiai
        assertThat(text).isEqualTo("abc");
    }

    @Test
    public void test_stingMatch() {
        String[] texts = {"abcd", "cde", "xyzw"};
        assertThat(texts)
                .hasSize(3)         // ir masyvo dydis = 3
                .contains("cde")    // ir lygus 'cde'
                .doesNotContain("xyz");  // ir nelygu 'xyz'
    }


}
