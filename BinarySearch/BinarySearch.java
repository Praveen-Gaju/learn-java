package BinarySearch;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(orderAgnosticBinarySearch(arr, 5));        
    }

    public static Integer iterativeBinarySearch(int[] input, int target) {
        int first = 0;
        int last = input.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (input[mid] == target) {
                return mid;
            } else if (input[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return null;
    }
    
    public static int recursiveBinarySearch(int[] input, int target, int start, int end) {
        if (start >= end) {
            return -1;
        } else {
            int mid = start + (end - start) / 2;

            if (target < input[mid]) {
                return recursiveBinarySearch(input, target, start, mid-1);
            } else if (target > input[mid]) {
                return recursiveBinarySearch(input, target, mid+1, end);
            } else {
                return mid;
            }
        }
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] <  arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }           
        }
        return -1;
    }
}

