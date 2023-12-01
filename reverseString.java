importjava.util.Scanner;
public class reverseString
 {
public static void main(String[] args)
 {
System.out.println("PROGRAM TO REVERSE A STRING USING RECURSION");
System.out.println("ENTER THE STRING TO BE REVERSED USING RECURSION");
Scanner input = new Scanner(System.in);
String str = input.nextLine();
System.out.println("THE REVERSED STRING IS: " + reverseString(str));
}
public static String reverseString(Stringstr)
 {
{
if(str.isEmpty())
returnstr;
returnreverseString(str.substring(1))+str.charAt(0);
}
}
}