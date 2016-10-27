package homework5;
import java.util.*;

public class IsoscelesTriangleStars {
	private int size;
	
	void init() {
		this.input();
		this.print();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
  		System.out.print("이등변삼각형 높이입력: ");
  		
  		this.size=s.nextInt();
  		System.out.print("\n");
    }
	
    void print() {
    	int starsCnt = this.size;
    	
  	  	for(int i=1;i<=starsCnt;i++) {  
  	  		for(int j=1;j<=(starsCnt-i);j++)  
  	  			System.out.print(" ");   
  	  		for(int j=1;j<=(i*2)-1;j++) 
  	  			System.out.print("*");    
  	  		
  	  		System.out.print("\n");  
  	  	}  
  	  	
  	  	System.out.print("\n");
    }
}
