import java.util.*;

public class practicecode {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements: ");
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the operations :");
        int c=sc.nextInt();
        Arrays.sort(arr);   
        switch (c) {
            case 1:
                System.out.println("largest element in array is :");
                System.out.println(arr[arr.length-1]);
                break;
            case 2:
                System.out.println("Smallest element in array is :");
                System.out.println(arr[0]);
            case 3:
                System.out.println("Secand Largest element in array is :");
                System.out.println(arr[arr.length-2]);
            case 4:
                System.out.println("Find element :");
                int target =sc.nextInt();
                for(int i=0;i<5;i++){
                    if(arr[i]==target){
                        System.out.println("Element found at :"+i);
                    }
                }
            case 5: 
                System.out.println("Even count :");
                int even=0;
                for(int i=0;i<5;i++){
                    if(arr[i]%2==0){
                        even++;
                System.out.println("Even number is :"+even);
                    }
                }




            default:
                throw new AssertionError();
        }
        
        
    }



}
