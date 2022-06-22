//Print alternate elements of an array - Day-0

public class GFGCode {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5};

        for (int i = 0; i < arr.length; i+=2) {
            System.out.print(arr[i] + " ");
        }
    }
}
