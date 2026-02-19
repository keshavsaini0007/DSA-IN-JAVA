import java.util.*;
public class insertion_sort {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the size of string : ");
        int n = scan.nextInt();
        int arr[] = new int[n];

    for(int i = 0; i<arr.length; i++){
        arr[i] = scan.nextInt();
    } // input

           for(int i = 1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
               while (j>=0 && temp<arr[j]) {
                   arr[j+1] = arr[j];
                   j--;
               }// changing  

             arr[j+1] = temp; // inserting
/* here j+1 is used at place of j
--> because in last step of while loop j become decrease by one */
            }

           for(int k = 0; k<arr.length; k++){
              System.out.print(arr[k]+" "); 
           } // printing

    }
}
