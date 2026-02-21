public class remove_element {
    
    public static int removeElement(int[] nums, int val) {
       int n = nums.length;
       int [] arr = new int[n];
       int k = 0;
       int i = 0;
       while(i<n){
        if(nums[i] != val){
            arr[k] = nums[i];
            k++;
            i++;
        }
        else{
            i++;
        }
       }
       
        for(int p = 0; p<k; p++){
            System.out.print(arr[p]+" ");
        }
       return k;
    }


    public static void main(String args[]){
        int nums[] = {1,2,3,4,1,2,1,1};
        int val = 4;
        int size = removeElement(nums,val);
    }
}
