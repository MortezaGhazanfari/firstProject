package sort;

import com.sun.tools.javac.Main;

public class InsertionSort {

    public int[] insertionSort(int[] numbers){
        for(int i=1;i<numbers.length;i++){
            for(int j = i; j>0;j--){
                if(numbers[j]<numbers[j-1]){
                    int temp = numbers[j];
                    numbers[j]=numbers[j-1];
                    numbers[j-1]=temp;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args){
        InsertionSort is = new InsertionSort();
        int[] unsortedNumbers = {6, 9, 3, 1 , 4, 2, 3};

        int[] sortedNumbers = is.insertionSort(unsortedNumbers);
        for(int i:sortedNumbers){
            System.out.println(i);
        }

    }
}
