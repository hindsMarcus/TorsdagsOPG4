package Task1;

public class Algorithms {

    // Har måske lavet opgaven lidt anderledes ift. beskrivelsen, men det virker, så håber det går :)

    // static int arr[] = {8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2};

    public static void main(String args[]) {

        int[] arr = {8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2};

        sortArray(arr);
    }

    public static void sortArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

