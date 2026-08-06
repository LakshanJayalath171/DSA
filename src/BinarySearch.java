public class BinarySearch {
    //implement of the binary search
    public static int binary_search(int [] array, int target){
        //defining low and high positions
        int low = 0;
        int high = array.length-1;

        //run the loop
        while (low<high){
            //defining the middle
            int middle = low + (high-low)/2;
            int value = array[middle];

            System.out.println("Middle "+value);

            //create a logic for a new low or high position
            if(target <value){
                high = middle-1;
            } else if (target >value) {
                low = middle+1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }

    static void main(String[] args) {

        //creating a sorted array
        int arr [] = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i+1;
        }

        //defining target
        int target = 21;

        //using the algorithm
        int index = binary_search(arr,target);
        if(index == -1){
            System.out.println(target + "Not found");
        }
        else {
            System.out.println("target found at"+index+1);
        }

    }
}