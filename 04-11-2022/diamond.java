/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main{
    static void pattern(int range){
        int n = 2*range;
        int c = 64;
        System.out.println();
        for(int row = 1;row<=range;row++){
            for(int space=range-row;space>0;space--){
                System.out.print("  ");
            }
            for(int col1=1;col1<=row;col1++){
                System.out.print(((char)(c+col1))+" ");
            }
            for(int col2=1;col2<row;col2++){
                System.out.print(((char)(c+row-col2))+" ");
            }System.out.println(); 
        }
        for(int row=1;row<range;row++){
            for(int space=1;space<=row;space++){
                System.out.print("  ");
            }
            for(int col1=1;col1<=range-row;col1++){
                System.out.print(((char)(c+col1))+" ");
            }
            for(int col2=1;col2<range-row;col2++){
                System.out.print(((char)(c+range-col2-row))+" ");//c+range-col2
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a range : ");
		int n = in.nextInt();
		pattern(n);
	}
}
