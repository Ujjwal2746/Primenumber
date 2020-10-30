package lol;
import java.util.*;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("Enter any number");
int count=0;
int n = sc.nextInt();
if(n==1||n==0)
	System.out.println("Number is neither prime nor composite");
else
{
for(int i = 1;i<=n;i++)
{
	int r = n%i;
	if(r==0)
     count++;
}
if(count==2)
	System.out.println("Number is prime");
else
	System.out.println("Number is not prime");

}

}
}