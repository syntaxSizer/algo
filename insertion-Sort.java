
/**
 *
 * @author Qusai Alfaki
 */
public class MyInsertionSort {

    /**
     *--------Insertion Sort---------
     *algorithm
     */

    public static void main(String[] args) {
        // TODO code application logic here
        int arr1 []= {3,6,3,8,7,0,12,32,-1,100};
        int[] arr2=insertsort(arr1);
// loop just to print the sorted array
        for (int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }

   }
 public static int[] insertsort(int [] input){
// the first for loop will loop through all the array while the second loop will loop up to i+1
// meaning this is how we can compare 2 elements next to each other 'temp' will hold the element being replaced
     int temp;
     for (int i =1; i<input.length; i++){
         for (int j=i; j>0; j--)
         {
           if(input[j]<input[j-1]){
             temp=input[j];
             input[j]=input[j-1];
             input[j-1]=temp;
         }
         }
     }
     return input;
         }
 }


