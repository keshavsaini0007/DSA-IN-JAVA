public class insert_sorting {

    public static void print(int arr[]){
        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[]args){
    int arr[] = {6,3,2,1,5,9};
    
    for(int i = 1; i<arr.length; i++){
       int curr = arr[i];
       int j = i-1;
          while(j>=0 && curr<arr[j]){
            arr[j+1] = arr[j];
            j--;
          }
        arr[j+1] = curr;    
    }
    print(arr);

    }
}
