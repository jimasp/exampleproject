import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class AppTest {
    @Test
    public void test_pass_java() {
        assertEquals(1, 1);
    }

    @Test
    @Ignore("test skipping")
    public void test_skip_java() {
        assertEquals(1, 1);
    }    

    @Test
    public void test_pass_java2() {
        assertEquals(1, 1);
    }



}
