package TaskTwo;

public class Main {

    public static void main(String[] args) {

        int[] array = {5, 6, 3, 2, 5, 1, 4, 9};

        bubbleSort(array);
        for (int j : array) {
            System.out.print(j + "  ");
        }
    }

    public static void bubbleSort(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}