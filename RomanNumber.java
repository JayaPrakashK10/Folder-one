import java.util.Scanner;

public class RomanNumber
{
    public static int romanValue(char c){
        if (c == 'I')
            return 1;
        if (c == 'V')
            return 5;
        if (c == 'X')
            return 10;
        if (c == 'L')
            return 50;
        if (c == 'C')
            return 100;
        if (c == 'D')
            return 500;
        if (c == 'M')
            return 1000;
        return -1;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        String s = sc.next();
        int result=0,flag=0;
        int v1=0,v2=0;
        for(int i=0;i<s.length();i++){
             v1=romanValue(s.charAt(i));
            if(v1==-1){
                flag=1;
                break;
            }
            if(i+1<s.length()){
                v2=romanValue(s.charAt(i+1));
                if(v2==-1){
                   flag=1;
                    break;
                }
                if(v1>=v2)
                    result+=v1;
                else{
                    result+=v2-v1;
                    i++;
                }
            }
            else{
                result+=v1;
            }
        }
        if(flag==1){
            System.out.println("Entered Roman number is invalid");
        }
        else{
            System.out.println("The numeric value of "+s+" is "+result);
        }
        
        
	}
}
