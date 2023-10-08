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

    @Test
    public void maxDotProductTest4() {
        int[] nums1 = {13,-7,12,-15,-7,8,3,-7,-5,13,-15,-8,5,7,-1,3,-11,-12,2,-12};
        int[] nums2 = {-1,13,-4,-2,-13,2,-4,6,-9,13,-8,-3,-9};
        int expected = 972;
        int actual = new Solution().maxDotProduct(nums1, nums2);

        Assert.assertEquals(expected, actual);
    }

}
