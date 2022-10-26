package stringdemo;

public class Stringdemo {
public static void main(String[] args) {
	String str1="keerthana";
	String str2="keerthana";
	if(str1==str2)
		{
		System.out.println("str1 = str2");
		}
	else {
		System.out.println("str1!=str2");
	}
		
String str3=new String("keerthana");
String str4=new String("keerthana");{
if(str3==str4) {
	System.out.println("str3==str4");
}
else
{
	System.out.println("str3!=str4");
}
}

if(str3.equals(str4)) {
	System.out.println("str3 is equal to str4");
}
else {
	System.out.println("str3 not equal to str4");
}


if(str3.compareTo(str4)!=0) {
	System.out.println("str3 compared to str4");
}
else {
	System.out.println("str3 not compared to str4");
}


String str="keerthi,preethi,karthi,parthi,sarathi";
System.out.println("str is:"+str);
int len=str.length();
System.out.println("length of the string is:"+len);

System.out.println(str.charAt(0)+"|"+str.charAt(len-1));

String s1=str.toUpperCase();
System.out.println("s1 is:"+s1);


if(str.contains("keerthi")) {
	System.out.println("keerthi is in the string");
}


String s2=str.substring(5);
System.out.println("s2 is:"+s2);
}
}

