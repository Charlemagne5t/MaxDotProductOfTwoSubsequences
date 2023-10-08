import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxDotProductTest1() {
        int[] nums1 = {2, 1, -2, 5};
        int[] nums2 = {3, 0, -6};
        int expected = 18;
        int actual = new Solution().maxDotProduct(nums1, nums2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxDotProductTest2() {
        int[] nums1 = {3, -2};
        int[] nums2 = {2, -6, 7};
        int expected = 21;
        int actual = new Solution().maxDotProduct(nums1, nums2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxDotProductTest3() {
        int[] nums1 = {-1, -1};
        int[] nums2 = {1, 1};
        int expected = -1;
        int actual = new Solution().maxDotProduct(nums1, nums2);

        Assert.assertEquals(expected, actual);
    }

}
