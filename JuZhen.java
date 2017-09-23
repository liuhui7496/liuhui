package exam03;

import java.util.Scanner;

public class JuZhen{
	public static void main(String[] args) {
		System.out.println("请输入一矩阵的阶数：");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		new JuZhen().printJuZhen(id);
	}
	public static String form = null;
	public void printJuZhen(int dim) {
		form ="%"+(String.valueOf(dim*dim).length()+1)+"d";
		int max = (dim%2==0)?(dim/2):(dim/2+1);
		for(int i=1;i<=max;i++) {
			for(int j=1;j<i;j++) {
				print(getSize(j,dim)-(i-j)+1);
				}
			printTopLine(i,dim);
			for(int j=i-1;j>0;j--) {
				print(getSize(j-1,dim)+(dim-2*(j-1))+i-j);
			}
			System.out.println();
			}
	for(int i=max+1;i<=dim;i++) {
		for(int j=1;j<=dim-i;j++) {
			print(getSize(j,dim)-(i-j)+1);
			}
		printBottemLine(dim-i+1,dim);
		for(int j=dim-i;j>0;j--) {
			print(getSize(j-1,dim)+(dim-2*(j-1))+i-j);
		}
		System.out.println();
		}
	}

	public void print(int i) {
		System.out.format(form,i);
		}
	public int getSize(int level, int dim) {
		int size =0;
		for(int i=1;i<=level;i++) {
			size+=4*(dim-2*(i-1))-4;
			
		}
		return size;
	}
	public void printTopLine(int level,int dim) {
		int size =getSize(level-1,dim);
		for(int i=0;i<dim-2*(level-1);i++) {
			print(size+1+i);
			
		}
	}
	public void printBottemLine(int level,int dim) {
		int size =getSize(level, dim);
		int first = size+1;
		for (int i=0;i<dim-2*(level-1);i++) {
			print(first-(dim-2*(level-1))+1-i);
		}
	}
}
