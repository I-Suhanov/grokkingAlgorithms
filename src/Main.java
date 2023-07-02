import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DifferentAlgorithms differentAlgorithms = new DifferentAlgorithms();
        int arrLength = 100;
        int[] list = new int[arrLength];

        Random random = new Random();
        int search = 1 + random.nextInt(arrLength);

        for (int i = 0; i < arrLength; i++){
            list[i] = i + 1;
        }
        System.out.println("Ищем число: " + search + " в массиве чисел от 1 до " + arrLength);
        System.out.println("Искомое число имеет индекс " + differentAlgorithms.binarySearch(list,search));


        ArrayList<Integer> integerArrayListForSorted = new ArrayList<>(arrLength);
        for (int i = 0; i < arrLength; i++) {
            integerArrayListForSorted.add(random.nextInt(arrLength*10));
        }
        System.out.println("Неупорядоченный масиив");
        System.out.println(integerArrayListForSorted);
        System.out.println("Массив после сортировки");
        System.out.println(differentAlgorithms.selectionSort(integerArrayListForSorted));
    }
}
