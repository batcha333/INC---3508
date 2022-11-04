/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main{
    static void pattern(int range){
        int n = 2*range;
        int c = 64;
        for(int row = 1;row<=range;row++){
            for(int space=range-row;space>0;space--){
                System.out.print("x");
            }
            for(int col1=1;col1<=row;col1++){
                System.out.print((char)(c+col1));
            }
            for(int col2=1;col2<row;col2++){
                System.out.print((char)(c+row-col2));
            }System.out.println(); 
        }
        for(int row=1;row<range;row++){
            for(int space=1;space<=row;space++){
                System.out.print("x");
            }
            for(int col1=(range-2*(row-1));col1>0;col1--){
                System.out.print((char)(c+1));
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n = 3;
		pattern(n);
	}
}
