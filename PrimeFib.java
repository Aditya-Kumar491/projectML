import java.util.*;
public class PrimeFib
{
    public static boolean isPrime(int n){
        if(n==0 || n==1)
            return false;
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static boolean isNotFibonnacui(int n){
        double number=5*n*n-4;
        double sqrt=Math.sqrt(number);   
        return ((sqrt - Math.floor(sqrt)) != 0);        
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
		    System.out.println("0");
		else if(isPrime(a)){
		    if(isNotFibonnacui(a))
		        System.out.println("1");
		    else
		        System.out.println("0");
		}
		else
		    System.out.println("0");
		
	}
}
