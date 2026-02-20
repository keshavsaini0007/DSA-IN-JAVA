
// public class selection_sort {
//     public static void print(int arr[]){
//         for(int i = 0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//    public static void main (String[]args){
//     int arr[] = {8,5,4,3,1,2};
//     for(int i = 0; i<arr.length; i++){
//         int smallest = i;
//         for(int j = i+1; j<arr.length; j++){
//             if(arr[j]<arr[smallest]){
//                 smallest = j;
//             }
//         }
//         int temp = arr[smallest];
//         arr[smallest] = arr[i];
//         arr[i] = temp;
//     }
//     print(arr); // to print the array
//    }    
// }

public class selection_sort{
    public static void print(char arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
    char arr[] = {'G','E','H','A','Q'};
         for(int i = 0; i<arr.length; i++){
             int small = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[small] > arr[j]){
                    small = j;
                }
            }
            char temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp ;
         }
         print(arr);
    }
    
}












