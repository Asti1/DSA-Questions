// Write a program to reverse an array or string
public class ReverseArr {
    static void rev(int[] a, int start, int end){
        int temp;
        while(start<end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    static void display(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rev(arr,0,4);
        display(arr);
    }
    // Recursive way
//    static void rev(int[] a, int start, int end){
//        int temp;
//        if (start>=end)
//            return;
//        temp = a[start];
//        a[start] = a[end];
//        a[end] = temp;
//        rev(a,start+1,end-1);
//    }
//    static void display(int[] a){
//       for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
//    }
   
}
