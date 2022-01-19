public class InsertionSort {
    public static void main(String args[]){
        int array [] = {25, 28, 11 ,5};
        System.out.println("Unsorted Array :");
        printArray(array);
        insertionSort(array);
        System.out.println("After Sorting : ");
        printArray(array);
    }
    static void insertionSort(int array[]){
        int key , j;
        for(int i = 0 ; i< array.length ; i++){
            key=array[i];
            j = i-1;
            while (j>=0 &&  array[j] > key){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

    }


    static void printArray(int array[]){
        for(int i=0; i<array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
