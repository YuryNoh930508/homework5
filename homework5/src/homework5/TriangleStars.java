package homework5;
import java.util.*;

public class TriangleStars {
    private int leftPadding;
    private int triangleHeight;
    
    void init() {
    	this.input();
    	this.print();
    }
  
    void input() {
    	Scanner s = new Scanner(System.in);
    	
		System.out.print("직각삼각형의 왼쪽여백과 높이입력: ");
		
		this.leftPadding = s.nextInt();
		this.triangleHeight = s.nextInt();
		System.out.print("\n");
 	}
    
    void print() {
    	int paddingCnt = this.leftPadding;
    	int levelCnt = this.triangleHeight;
 	
    	for (int i=0;i<levelCnt;i++) {
    		for (int j=i;j<paddingCnt;j++)
    			System.out.print(" ");
    		for (int j=0;j<=i;j++)
    			System.out.print("*");
    		
		  System.out.print("\n");
    	}
    	
    	System.out.print("\n");
    }
}
