package exam02;
import java.util.Scanner;

public class DiGui {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个大于0的整数：");
		Scanner s=new Scanner(System.in);
		int i= s.nextInt();
		print(i);	
		}


	public static void print(int n) {
	System.out.println(n);
	if (n < 5000)
	print(2 * n);
	System.out.println(n);
	}
	}