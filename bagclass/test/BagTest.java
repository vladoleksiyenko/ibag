import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import structures.Bag;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BagTest {

    @Test
    public void constructorCapacityTest() {
        final int TEST_CAPACITY = 6;
        Bag myBag = new Bag(6);

        int capacity = myBag.capacity();

        assertEquals(TEST_CAPACITY, capacity);
    }

    @Test
    public void addingSizeIncreaseTest() {
        Bag myBag = new Bag(10);

        myBag.add("a");
        myBag.add("b");
        myBag.add("c");

        int size = myBag.size();
        assertEquals(3, size);
    }

    @Test
    public void containsElementFoundTest() {
        Bag myBag = new Bag(10);

        myBag.add("a");

        boolean found = myBag.contains("a");
        assertTrue(found);
    }

    @Test
    public void containsElementNotFoundTest() {
        Bag myBag = new Bag(10);

        myBag.add("a");

        boolean found = myBag.contains("a");
        assertTrue(found);
    }

    @RepeatedTest(5)
    public void randomInsertTest() {
        Bag myBag = new Bag(10);

        myBag.add(new Random().nextDouble());

        int size = myBag.size();
        assertEquals(1, size);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    public void differentCapacityTest(int testCapacity) {
        Bag myBag = new Bag(testCapacity);
        int capacity = myBag.capacity();

        assertEquals(testCapacity, capacity);
    }







}
