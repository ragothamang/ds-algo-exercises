package striver.recursion.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicRecursionPattern {

	
	public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
//		int[] arr = { 3, 1 };
//		int[] arr = { 3 };
        ArrayList<Integer> list = new ArrayList<>();
        printSub(0, arr, list);
//        System.out.println(list.size());
        
        
    }

    private static void printSub(int i, int[] arr, ArrayList<Integer> list) {
//    	System.out.print("  i *-->   "+ i +" arr  "+  Arrays.toString(arr) + " list "+ list + " size " + list.size());
        if (i == arr.length) {
            System.out.println(list.toString());
            return;
        }
        list.add(arr[i]);
        printSub(i + 1, arr, list);
        
        list.remove(list.size() - 1);
//        System.out.println(" removed -->  "+ list);
        printSub(i + 1, arr, list);
//        System.out.println("** after remove -->  "+ list);
    }

   static void f(int ind  ,int a[]  ,ArrayList<Integer> list,  int k,int sum){
        if(ind==a.length){
            if(k==sum){
            System.out.println(list);
            }
            return ;
        }
        //take
        list.add(a[ind]);
        sum+=a[ind];
        f(ind+1,a,list,k,sum);
        
        list.remove(list.size() - 1);
        sum-=a[ind];
        f(ind+1,a,list,k,sum);
        
    }
}
