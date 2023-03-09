package sort;

public class SelectionSort {


    public int[] selectionSort(int[] numbers){
        for(int i=0; i<numbers.length-1;i++){
           int smallestNumberIndex=i;
           for(int j=i+1; j<numbers.length;j++)
            {
                if (numbers[j]<numbers[smallestNumberIndex]) {
                    smallestNumberIndex=j;
                }
            }
           int temp = numbers[i];
           numbers[i] = numbers[smallestNumberIndex];
           numbers[smallestNumberIndex] = temp;
        }
        return numbers;
    };

    public static void main(String[] args) {
        int[] unsortedNumbers = {6, 9, 3, 1 , 4, 2, 3};
        SelectionSort ss = new SelectionSort();
        int[] sortedNumber = ss.selectionSort(unsortedNumbers);

    };
}
