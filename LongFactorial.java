package problemSolving;
import java.util.*;
import java.io.*;
import java.math.*;
public class LongFactorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BigInteger big=BigInteger.valueOf(n);
		for(int i=1;i<n;i++)
		{
			big=big.multiply(BigInteger.valueOf(i));
		}
		System.out.println(big);

	}

}
