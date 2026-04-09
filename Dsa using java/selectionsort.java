import java.util.Scanner;

public class selectionsort {
    public static void main(String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size=sc.nextInt();
        int min;

        System.out.println("Enter elements of array:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                min=i;
                if(arr[min]<arr[j])
                {
                    min=j;
                }
                int temp=arr[min];
                arr[min]=arr[j];
                arr[j]=temp;
            }
            
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }


    }
    
}
