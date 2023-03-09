package sort;

public class BubbleSort {

    public int[] bubbleSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    final int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    };



    public static void main(String[] args) {
        int[] unsortedNumbers = {0, 6, 9, 3, 4, 2, 3, 0};
        BubbleSort bs = new BubbleSort();
        //int[] sortedNumber = bs.bubbleSort(unsortedNumbers);

    };
}


