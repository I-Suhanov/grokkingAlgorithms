import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DifferentAlgorithms {

    Random random = new Random();
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

    public List<Integer> createdArrayForSorted(int size){
        List<Integer> integerArrayListForSorted = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            integerArrayListForSorted.add(random.nextInt(size*10));
        }
        return integerArrayListForSorted;
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

    public List<Integer> quickSort(List<Integer> arr){
        int pivot;
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        List<Integer> result = new ArrayList<>(arr.size());
        if(arr.size()<2){
            return arr;
        } else {
            pivot = arr.remove(0);
            for (int item:arr) {
                if (item <= pivot) {
                    less.add(item);
                } else greater.add(item);
            }
            result.addAll(quickSort(less));
            result.add(pivot);
            result.addAll(quickSort(greater));
            return result;
        }
    }
}
