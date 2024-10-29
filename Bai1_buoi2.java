public class Bai1_buoi2 {

        public static int binarySearch(int[] nums, int target) {  
            int left = 0;  
            int right = nums.length - 1;  
    
            while (left <= right) {  
                int mid = left + (right - left) / 2; 
    
                if (nums[mid] == target) {  
                    return mid;  
                } else if (nums[mid] < target) {  
                    left = mid + 1;
                } else {  
                    right = mid - 1;
                }  
            }  
    
            return -1;
        } 
             public static void main(String[] args) {  
            int k = 9;
            int[] nums = {-1, 0, 3, 5, 9, 12};
            int index = binarySearch(nums, k);  
            System.out.println(index);  
        }  
    }
