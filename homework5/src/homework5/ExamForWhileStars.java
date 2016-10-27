package homework5;
import java.util.*;

public class ExamForWhileStars {

	public static void main(String[] args) {
		int selectedModule;
		
		Scanner s = new Scanner(System.in);
		
	    do{
	    	System.out.println("1. 정사각형별찍기");
	    	System.out.println("2. 직각삼각 별찍기");
	    	System.out.println("3. 이등변삼각형 별찍기");
	    	System.out.println("4. 다이아몬드 별찍기  ");
	    	System.out.println("5. 종료하기");
	    	System.out.print("원하는 메뉴는>> ");
	    	
	    	selectedModule = s.nextInt();
	    	
	    		if(selectedModule == 1)
	    			new RectagleStars().init();
	    		
	    		else if(selectedModule == 2)
	    			new TriangleStars().init();
	    		
	    		else if(selectedModule == 3)
	    			new IsoscelesTriangleStars().init();
	    		
	    		else if(selectedModule == 4)
	    			new DiamondStars().init();
	    		
	    } while(selectedModule!=5);
	    
	    System.out.println("종료하셨습니다.");
	}
}
