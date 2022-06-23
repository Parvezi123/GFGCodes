//Value equal to index value: Day-1

import java.util.ArrayList;

public class GFGCode1 {
    public static void main(String[] args) {
        ValueEqualToIndex valueEqualToIndex = new ValueEqualToIndex();
        System.out.println(valueEqualToIndex.valueEqualToIndex(new int[]{3,2,1,4,6},5));
    }
}

class ValueEqualToIndex {
    ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) {
                arrayList.add(arr[i]);
            }
        }
        return arrayList;
        }
    }
