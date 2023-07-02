import java.util.ArrayList;
import java.util.List;

public class DifferentAlgorithms {
    public int binarySearch(int[] list, int item){
        int low = 0;
        int high = list.length - 1;
        int mid;
        int guess;

        while (high >= low){
            mid = (low + high) / 2;
            guess = list[mid];
            if(guess == item){
                return mid;
            } else if (item < guess) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public List<Integer> selectionSort(List<Integer> arr){
        int size = arr.size();
        List<Integer> sortedArr = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            sortedArr.add(arr.remove(findSmallest(arr)));
        }
        return sortedArr;
    }

    public int findSmallest(List<Integer> arr){
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for (int i = 1; i < arr.size(); i++) {
            if(smallest > arr.get(i)){
                smallestIndex = i;
                smallest = arr.get(i);
            }
        }

        return smallestIndex;
    }
}
