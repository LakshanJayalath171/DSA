public class LinierSearch {

    //defining the linier search algorithm
    public static int LinierSearchAlgo(int[]arr,int value){
        for(int i=0 ; i < arr.length;i++){
            if(arr[i] == value){
                return i;
            }

        }
        return -1;
    }

    static void main(String[] args) {
        int [] array = {1,8,5,3,2,6,4,7,9};

        int index = LinierSearchAlgo(array,11);

        if(index != -1){
            System.out.println("Value found at "+ index);
        }
        else{
            System.out.println("Value not found");
        }
    }
}
