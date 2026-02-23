import java.util.*;

public class indexes_of_two_no_whose_sum_is_equal_to_target {

    // Method to find and print the indexes of two numbers whose sum equals the target 'n'
    public static void comb(int[] arr, int n) {
        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Loop through the elements after the current one to avoid duplicate pairs
            for (int j = i + 1; j < arr.length; j++) {
                // Check if the sum of the two numbers equals the target
                if (arr[i] + arr[j] == n) {
                    // If a matching pair is found, print their indexes and exit the method
                    System.out.println("[" + i + "," + j + "]");
 // orr
                        // { arrrrr[0] = arr[i] ;
                        // arrrrr[1] = arr[j] ;
                        // System.out.println(Arrays.toString(arrrrr));}
                        
                    return;
                }
            }
        }
        // If no such pair is found, print this message
        System.out.println("pair not found....");
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        // Ask the user to input the target sum
        System.out.print("Enter the target sum: ");
        int n = scan.nextInt();

        // Define the array to be searched
        int arr[] = {3, 2, 1, 5, 4};

        // Call the method to find the index pair
        comb(arr, n);
    }
}


