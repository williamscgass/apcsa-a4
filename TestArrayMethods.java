import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;

public class TestArrayMethods extends Autograder<Object[]> {

    @Test
    public void freePoints() {
        test("freePoints", () -> {
            return "thank you i'll take these free points";
        }, "", "free points", 10);
    }

    @Test
    public void testElementAdd1() {
        int[] arr = new int[] { 1, 2, 3 };
        int x = 4;
        int[] out = new int[] { 5, 6, 7 };

        test("testElementAdd1", () -> {
            ArrayMethods arrayMethods = new ArrayMethods();
            arrayMethods.elementAdd(arr, x);
            assertArrayEquals(arr, out);
            return Arrays.toString(arr);
        },  Arrays.toString(arr) + "\n" + "x: " + x, Arrays.toString(out), 10); // Assuming 10 points for this test
    }

    @Test
    public void testElementAdd2() {
        int[] arr = new int[] { -3, 2, 12, 26, 99 };
        int x = -10;
        int[] out = new int[] { -13, -8, 2, 16, 89 };

        test("testElementAdd2", () -> {
            ArrayMethods arrayMethods = new ArrayMethods();
            arrayMethods.elementAdd(arr, x);
            assertArrayEquals(arr, out);
            return Arrays.toString(arr);
        }, Arrays.toString(arr) + "\n" + "x: " + x, Arrays.toString(out), 10); // Assuming 10 // this test
    }

    @Test
    public void testMin1() {
        int[] arr = new int[] { 3, 4 };
        int out = 3;

        test("testMin1", () -> {
            ArrayMethods arrayMethods = new ArrayMethods();
            int res = arrayMethods.min(arr);
            assertEquals(res, out);
            return res;
        }, Arrays.toString(arr), out, 10); // Assuming 10 points for this test
    }

    @Test
    public void testMin2() {
        int[] arr = new int[] { 3, 9, 10, 2, -1, -77, 8, 12 };
        int out = -77;

        test("testMin2", () -> {
            ArrayMethods arrayMethods = new ArrayMethods();
            int res = arrayMethods.min(arr);
            assertEquals(res, out);
            return res;
        }, Arrays.toString(arr), out, 10); // Assuming 10 points for this test
    }

    @Test
    public void testMin3() {
        int[] arr = new int[] { 12, 7, 12, 7, 33, 77, 88 };
        int out = 7;

        test("testMin3", () -> {
            ArrayMethods arrayMethods = new ArrayMethods();
            int res = arrayMethods.min(arr);
            assertEquals(res, out);
            return res;
        }, Arrays.toString(arr), out, 10); // Assuming 10 points for this test
    }

    @Test
    public void testRange1() {
        int[] arr = new int[] { 3, 4 };
        int out = 1;

        test("testRange1", () -> {
            ArrayMethods arrayMethods = new ArrayMethods();
            int res = arrayMethods.range(arr);
            assertEquals(res, out);
            return res;
        }, Arrays.toString(arr), out, 10); // Assuming 10 points for this test
    }

    @Test
    public void testRange2() {
        int[] arr = new int[] { 3, 9, 10, 2, -1, -77, 8, 12 };
        int out = 89;

        test("testRange2", () -> {
            ArrayMethods arrayMethods = new ArrayMethods();
            int res = arrayMethods.range(arr);
            assertEquals(res, out);
            return res;
        }, Arrays.toString(arr), out, 10); // Assuming 10 points for this test
    }

    @Test
    public void testRange3() {
        int[] arr = new int[] { 12, 7, 12, 7, 33, 77, 88 };
        int out = 81;

        test("testRange3", () -> {
            ArrayMethods arrayMethods = new ArrayMethods();
            int res = arrayMethods.range(arr);
            assertEquals(res, out);
            return res;
        }, Arrays.toString(arr), out, 10); // Assuming 10 points for this test
    }

    @Test
    public void testRange4() {
        int[] arr = new int[] { 1, 1, 1, 1, 1, 1 };
        int out = 0;

        test("testRange4", () -> {
            ArrayMethods arrayMethods = new ArrayMethods();
            int res = arrayMethods.range(arr);
            assertEquals(res, out);
            return res;
        }, Arrays.toString(arr), out, 10); // Assuming 10 points for this test
    }

    @Test 
    public void testUniqueSum1() {
        int[] arr = new int[] { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 5 };
        int out = 1 + 2 + 3 + 5;

        test("testUniqueSum1", () -> {
            ArrayMethods arrayMethods = new ArrayMethods();
            int res = arrayMethods.uniqueSum(arr);
            assertEquals(res, out);
            return res;
        }, Arrays.toString(arr), out, 1);
    }

    @Test
    public void testUniqueSum2() {
        int[] arr = new int[] { 1, 1, 1, 1, 1, 1 };
        int out = 1;

        test("testUniqueSum2", () -> {
            ArrayMethods arrayMethods = new ArrayMethods();
            int res = arrayMethods.uniqueSum(arr);
            assertEquals(res, out);
            return res;
        }, Arrays.toString(arr), out, 1);
    }
}
