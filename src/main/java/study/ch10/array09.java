package study.ch10;

import java.util.Arrays;

import java.util.Random;

public class array09 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {


        int[] nums = new int[40];
        Random random =new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100) + 1;

        }
        int[] sortedNums = nums.clone();

        bubbleSort(nums);


        System.out.print("정렬 전: ");
        System.out.println(Arrays.stream(sortedNums).boxed().toList());
        System.out.print("정렬 후: ");
        System.out.println(Arrays.stream(nums).boxed().toList());


    }
}


