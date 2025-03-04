public class Main {
    public static class BubbleSort {
        public static void bubbleSort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j + i < n - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {

            int[] numbers = {5, 12, 2, 16, 4, 8, 9, 0};
            bubbleSort(numbers);
            for (int number : numbers) {
                System.out.print(number + " ");
            }

        }
    }
}
