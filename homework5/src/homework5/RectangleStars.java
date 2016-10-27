package homework5;
import java.util.*;

public class RectangleStars {
	private int size;
	
	 void init() {
		 this.input();
		 this.print();
	 }
	 
     void input(){
     	Scanner s = new Scanner(System.in);
 		System.out.print("정사각형 크기입력: "); 		
 		this.size = s.nextInt();
 		System.out.print("\n");
     }
     
     void print(){
    	 int starsCnt = this.size;
     	 for(int i=0;i<starsCnt;i++) {
     		   for (int j=0;j<starsCnt;j++)
     		    System.out.print("*");
     		   
     		   System.out.print("\n");
     	 }
     	 
     	 System.out.print("\n");
     }
}
