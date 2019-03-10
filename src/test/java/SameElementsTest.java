import org.junit.Test;

import static org.junit.Assert.*;

public class SameElementsTest {

    @Test
    public void findSameElementsTest() {
        int[] ints = {1, 2, 3, 4, 5, 3};
        int[] ints2 = {1, 2, 3, 4, 5};
        assertFalse(SameElements.findSameElements(ints2));
        assertTrue(SameElements.findSameElements(ints));
    }

    @Test
    public void checkSameTest() {
        int[] ints = {1, 2, 3, 4, 5};
        assertTrue(SameElements.checkSame(ints, 3, 0));
        assertFalse(SameElements.checkSame(ints, 6, 0));

    }

}
