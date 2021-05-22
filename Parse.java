import java.util.*;
public class Parse
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
        String digit="",alpha="",character="";
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            int ascii=(int) ch;
            if(ascii>=48 && ascii<=57)
                digit=digit+String.valueOf(ch);
            else if((ascii>=65 && ascii<=90)||(ascii>=97 && ascii<=122))
                alpha=alpha+String.valueOf(ch);
            else
                character=character+String.valueOf(ch);


        }
        System.out.println(alpha);
        System.out.println(digit);
        System.out.println(character);
	}
}