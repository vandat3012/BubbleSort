
public class Main {
    public static void BubbleSort (int array[]){
        for (int i = 0; i < array.length -1 ; i++) {
            for (int j = array.length - 1 ; j > i ; j--) {
                if (array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,1,6,8,5,4,9,-4,-5};
        BubbleSort(arr);
        for (int e : arr) {
            System.out.println(e);
        }

    }
}