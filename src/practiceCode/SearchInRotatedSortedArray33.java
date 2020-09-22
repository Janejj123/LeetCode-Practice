package practiceCode;

public class SearchInRotatedSortedArray33 {

    public static void main(String[] args) {
        int[] A = new int[5];
        A[0] = 3;
        A[1] = 5;
        A[2] = 7;
        A[3] = 1;
        A[4] = 2;

        SearchInRotatedSortedArray33 testing = new SearchInRotatedSortedArray33();
        int res = testing.search(A, 5);
        System.out.println(res);
    }

    int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;

        while (lo < hi) {
            mid = lo + ((hi - lo) >> 1);
            if (nums[mid] > nums[hi])
                lo = mid + 1;
            else
                hi = mid;
        }
        int pivot = lo;

        if (nums[pivot] == target) return pivot;

        if (target > nums[pivot] && target <= nums[nums.length - 1]) {
            lo = pivot;
            hi = nums.length - 1;
            while (lo < hi) {
                mid = lo + ((hi - lo) >> 1);
                if (target == nums[mid]) return mid;

                else if (target > nums[mid]) lo = mid + 1;
                else hi = mid -1;
            }
        } else {
                lo = 0;
                hi = pivot - 1;
                while (lo <= hi) {
                    mid = lo + ((hi - lo) >> 1);
                    if (target == nums[mid]) return mid;
                    else if (target > nums[mid]) lo = mid+1;
                    else hi = mid-1;
                }
            }
        return -1;
        }
    }

