import java.util.*;

public class Main {
    public static void main(String[] args) {
        DifferentAlgorithms differentAlgorithms = new DifferentAlgorithms();
        int arrLength = 10;
        int[] list = new int[arrLength];

        Random random = new Random();
        int search = 1 + random.nextInt(arrLength);

        for (int i = 0; i < arrLength; i++){
            list[i] = i + 1;
        }
        System.out.println("Ищем число: " + search + " в массиве чисел от 1 до " + arrLength);
        System.out.println("Искомое число имеет индекс " + differentAlgorithms.binarySearch(list,search));


        List<Integer> integerArrayListForSorted = differentAlgorithms.createdArrayForSorted(arrLength);
        System.out.println("Неупорядоченный масиив");
        System.out.println(integerArrayListForSorted);
        System.out.println("Массив после сортировки");
        System.out.println(differentAlgorithms.selectionSort(integerArrayListForSorted));

        integerArrayListForSorted = differentAlgorithms.createdArrayForSorted(arrLength);
        System.out.println("Неупорядоченный масиив");
        System.out.println(integerArrayListForSorted);
        System.out.println("Массив после сортировки");
        System.out.println(differentAlgorithms.quickSort(integerArrayListForSorted));

        Map<String, List<String>> graph = new HashMap<>();

        graph.put("Bob", Arrays.asList("Alice", "Sten", "Mitchel"));
        graph.put("Alice", Arrays.asList("Peggy", "Sten"));
        graph.put("Sten", Arrays.asList("Anuj Mango", "Peggy"));
        graph.put("Mitchel", Arrays.asList("Thom", "Jonny Mango"));
        graph.put("Anuj Mango", Collections.emptyList());
        graph.put("Peggy", Collections.emptyList());
        graph.put("Thom", Collections.emptyList());
        graph.put("Jonny Mango", Collections.emptyList());

        System.out.println(differentAlgorithms.searchMangoSaler("Bob", graph));
        System.out.println(differentAlgorithms.searchMangoSaler("Peggy", graph));

    }
}
