package lol;

public class check {

	public static void main(String[] args) {
		int a,b,c,d,e;
		a=b=c=d=e=1;
		if(a==1)
		{
			System.out.println("a");
		}
		if(a!=b)
		{
			System.out.println("ab");
		}
		else if(b==c)
		{
			System.out.println("abc");
		}
		else if(c==e)
		{
			System.out.println("abcd");
		}
		if(c!=d)
		{
			System.out.println("abcd");
		}
		else
		{
			System.out.println("lol");
		}

	}

}
