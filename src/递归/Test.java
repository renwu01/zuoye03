package 递归;

import java.util.Scanner;

public class Test {
	 public int recursive(int a){
	       if(a==1){
	           return 1;
	       }     
	       return a * recursive(a-1);
	    }  
	    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
	       Test test = new Test();
	       int result = test.recursive(n);
	       System.out.println(+n+"的阶乘="+result);
	    }
	}
