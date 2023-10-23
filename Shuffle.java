import java.util.Scanner;
import java.util.Random;

public class Shuffle
{
    
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println("Before shuffling : ");
		for(int i=0;i<arr.length;i++){
		       System.out.print(arr[i]+" ");
		}
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			int r= random.nextInt(arr.length);
			int temp= arr[r];
			arr[r] = arr[i];
			arr[i] = temp;
		}
		System.out.println("\nAfter shuffling : ");
		for(int i=0;i<arr.length;i++){
		       System.out.print(arr[i]+" ");
		}
		
	}
}