package Normal;
import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
             int temp=arr[i];
             int j = i-1;
             while(j>=0&&arr[j]>temp)
             {
                arr[j+1]=arr[j];
                j--;
             }
            arr[j+1]=temp;
            
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]);
        }
        
    }
    
}