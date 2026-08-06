public class BubbleSort {

    //defining algorithm
    public static void bubbleSort(int array[]){
        //outer loop
        for (int i = 0; i < array.length-1; i++) {
            //inner loop
            for (int j = 0; j < array.length-1; j++) {
                //checking values
                if (array[j]> array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    static void main(String[] args) {

        //defining a array
        int arr [] = {9,5,2,3,4,7,6,1,8};

        //calling algorithm
        bubbleSort(arr);

        //printing value of array
        for(int i :arr){
            System.out.print(i);
        };
    }
}