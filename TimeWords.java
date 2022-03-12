package problemSolving;
import java.util.*;
import java.io.*;
public class TimeWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String[] s= {"zero","one","two","three","four","five","six",
				"seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eightteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five",
				"twenty six","twenty seven","twenty eight","twenty nine"};
		
		String time="";
		if(b<=30)
		{
			if(b==0)
			{
				time=s[a]+" o' clock";
			}
			else if(b==15)
			{
				time="quarter past "+s[a];
			}
			else if(b==30)
			{
				time="half past "+s[a];
			}
			else if(1<=b && b<15)
			{
				time=s[b]+" minutes past "+s[a];
			}
			else if(15<b && b<30)
			{
				time=s[b]+" minutes past "+s[a];
			}
		}
		else {
			if(b==45)
			{
				time="quarter to "+s[a+1];
			}
			else
			{
				time=s[60-b]+"minutes to "+s[a+1];
			}
		}
		System.out.println(time);
		
	}

}
