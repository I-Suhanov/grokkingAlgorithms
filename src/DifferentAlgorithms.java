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
}
