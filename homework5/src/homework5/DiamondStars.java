package homework5;
import java.util.*;

public class DiamondStars {
	  private int size;
	  
	  void init() {
		  this.input();
		  this.print();
	  }
	  
	  void input() {
		  Scanner s = new Scanner(System.in);
		  
		  System.out.print("다이아몬드의 크기입력: ");
		  
		  this.size = s.nextInt();
		  System.out.print("\n");
	  }
	  
	  void print() {
		  int starsCnt = this.size;
		  int loopIndex = 1;
		  boolean isTop = true;
		  
		  while(loopIndex > 0) {
			  for(int j=1;j<=starsCnt-loopIndex;j++)   		 
				  System.out.print(" ");  
			  for(int j=1;j<=(loopIndex*2)-1;j++)  
				  System.out.print("*");    
			  
  	    	  System.out.print("\n");
  	    	  
			  if(loopIndex == starsCnt)
				  isTop = false;
			  if(isTop)
				  loopIndex++;
			  else
				  loopIndex--;
		  }
		  
		  System.out.print("\n");
	  }
}
