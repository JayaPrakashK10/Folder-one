import java.util.Scanner;

public class Pangram
{
    public static boolean pangram_check(String s){
        int arr[]= new int[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                arr[s.charAt(i) - 'A']=1;
            }
             if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                arr[s.charAt(i) - 'a']=1;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=1)
                return false;
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        if(pangram_check(s))
            System.out.print("Given String is pangram\n");
        else
             System.out.print("Given String is not pangram\n");
	}
}