import java.util.*;
public class VowelCons
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        String vowel="",consonants="",input1;
        for(int i=0;i<a;i++){
            input1=sc.next();
            if(input1.charAt(0)=='A' || input1.charAt(0)=='E' || input1.charAt(0)=='I' || input1.charAt(0)=='O' || input1.charAt(0)=='U' )
                vowel=vowel+input1;
            else if(input1.charAt(0)=='a' || input1.charAt(0)=='e' || input1.charAt(0)=='i' || input1.charAt(0)=='o' || input1.charAt(0)=='u')
                vowel=vowel+input1;
            else
                consonants=consonants+input1;
        }
        int v=vowel.length();
        int c=consonants.length();
        if(c>v){
            for(int i=0;i<v;i++){
                System.out.println(vowel.charAt(i));
                System.out.println(consonants.charAt(i));
            }
            for(int j=v;j<c;j++)
                System.out.println(consonants.charAt(j));
        }
        else{
            for(int i=0;i<c;i++){
                System.out.println(vowel.charAt(i));
                System.out.println(consonants.charAt(i));
            }
            for(int j=c;j<v;j++)
                System.out.println(vowel.charAt(j));
        }
	}
}