import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DifferentCasesTest {

    @Test
    public void creationCollectionWithAllCombinationsTest() {
        int[] ints = {1, 2, 3, 4, 5, 6};
        DifferentCases.printArrayList(DifferentCases.creationCollectionWithAllCombinations(ints));
    }

    @Test
    public void compareToTest() {
        ArrayList<Integer> integers1 = new ArrayList<Integer>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);

        ArrayList<Integer> integers2 = new ArrayList<Integer>();
        integers2.add(1);
        integers2.add(2);
        integers2.add(3);

        assertEquals(0, DifferentCases.compareTo(integers1, integers2));
    }
}
