import java.util.Scanner;
class VowelConsonant
{
public static void main(String args[])
{
String ch;
Scanner sc = new Scanner(System.in);
ch = sc.next();
switch(ch)
{
case "a":
case "e":
case "i":
case "o":
case "u":
System.out.println("Vowel");
break;
default:
System.out.println("Consonant");
break;
}
}
}
