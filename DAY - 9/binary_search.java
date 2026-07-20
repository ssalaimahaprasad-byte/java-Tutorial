package day9;

public class binary_search {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int target = 5;
        System.out.println(binary_search(arr,target));
    }
    static int binary_search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){//equal ahh irruntha else part run ahhgum
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
