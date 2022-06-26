//Second Largest of an Array: Day-2
//Time-Complexity : worst (Need to be Optimized:(

public class GFGCode2 {
    public static void main(String[] args) {
        int[] arr = new int[]{8,2,9,1,6,3,4,7};
        SecondLargestClass secondLargest = new SecondLargestClass();
        int result = secondLargest.SecondLargest(arr,8);
        System.out.println(result);
    }
}

class SecondLargestClass {
    int SecondLargest(int[] arr,int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[n-2];
    }
}