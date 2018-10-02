
package za.co.reverside.training.p03;


public class Star {
   
public void squareStar(int row){
	
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
	

public void hollowSquare(int row){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <row; j++) {
                if(i==0 || i==4){
                System.out.print("*");
            }else if(j==0 || j==4){
                System.out.print("*"+"   ");
                        }else{
                  System.out.print("");
            }
            }
            System.out.println();
        }
}	

public void hollowSquareStar(int row){

        for(int i=1;i<=row;i++)
     {
         for(int j=1;j<=row;j++)
         {
             if(i==j ||i==1 || i ==row || j==1 || j==row||i*2==j||i/2==j){
              System.out.print("*");
             }else{
              System.out.print(" ");
             }
             
         }
         System.out.println("");
     }
}

public void rhombusStar(int row){

        for(int i=1;i<=row;i++)
     {
         for(int j=i;j<row;j++)
         {
             System.out.print(" ");
         }
         for(int j=1;j<=row;j++)
         {
             System.out.print("*");
         }
         System.out.println("");
     }
} 

public void hollowRhombus(int row){

     
        for(int i=1;i<=row;i++)
     {
         for(int j=i;j<row;j++)
         {
             System.out.print(" ");
         }
         for(int j=1;j<=row;j++)
         {
             if(i==1 || i ==row || j==1 || j==row){
              System.out.print("*");
             }else{
              System.out.print(" ");}

         }
         System.out.println("");
     }
} 

public void mirroredRhombus(int row){

     int num2=0;
        for(int i=1;i<=row;i++)
     {
         for(int j=0;j<num2;j++)
         {
             System.out.print(" ");
         }
         num2++;
         for(int j=1;j<=row;j++)
         {
             
              System.out.print("*");
            

         }
         System.out.println("");
     }
}

public void hollowMirroredRhombus(int row){

     int num2=0;
        for(int i=1;i<=row;i++)
     {
         for(int j=0;j<num2;j++)
         {
             System.out.print(" ");
         }
         num2++;
         for(int j=1;j<=row;j++)
         {
             if(i==1 || i ==row || j==1 || j==row){
              System.out.print("*");
             }else{
              System.out.print(" ");}

         }
         System.out.println("");
     }
} 
//RIGHT TRIANGLE STAR PATTERN
static void rightTriangle(int row){

        for(int i=1;i<=row;i++)
     {
        for(int j=1;j<=i;j++)
         {
             System.out.print("*");
         }
         System.out.println("");
	 }
}
//HOLLOW RIGHT TRIANGLE STAR PATTERN
static void hollowRightTriangle(int row){

        for(int i=1;i<=row;i++)
     {
         for(int j=1;j<=i;j++)
         {
            if(i==row||j==1||j==i){
             System.out.print("*");
             }else{
             System.out.print(" ");
             }
             
         }
         System.out.println("");
	 }
//MIRRORED RIGHT TRIANGLE STAR PATTERN
static void mirroredRightTriangle(int row){

        for(int i=1;i<=row;i++)
     {
         for(int j=i;j<row;j++)
         {
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++)
         {
             System.out.print("*");
         }
         System.out.println("");
     }
 }
//HOLLOW MIRRORED RIGHT TRIANGLE STAR PATTERN
static void hollowMirrpredRightTriangle(int row){

        for(int i=1;i<=row;i++)
     {
         for(int j=i;j<row;j++)
         {
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++)
         {
            if(i==row||j==1||j==i){
             System.out.print("*");
             }else{
             System.out.print(" ");
             }
         }
         System.out.println("");
	 }
}
//INVERTED RIGHT TRIANGLE STAR PATTERN
static void invertedRightTriangle(int row){

        for(int i=row;i>=1;i--)
     {
         
         for(int j=1;j<=i;j++)
         {
           
             System.out.print("*");
            
         }
         System.out.println("");
	 }
}
		 
//HOLLOW INVERTED RIGHT TRIANGLE STAR PATTERN
static void hollowInvertedRightTraingle(int row){

        for(int i=row;i>=1;i--)
     {
         
         for(int j=1;j<=i;j++)
         {
           if(i==row||j==1||j==i){
             System.out.print("*");
           }else{
             System.out.print(" ");
           }
            
         }
         System.out.println("");
	 }
}
//INVERTED MIRRORED RIGHT TRIANGLE STAR PATTERN
static void invertedMirroredRightTriangle(int row){

        for(int i=row;i>=1;i--)
     {
         for(int j=i;j<row;j++)
         {
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++)
         {
           
             System.out.print("*");
            
         }
         System.out.println("");
	 }
}

//HOLLOW INVERTED MIRRORED RIGHT TRIANGLE STAR PATTERN
static void hollowInvertedMirroredRightTriangle(int row){

        for(int i=row;i>=1;i--)
     {
         for(int j=i;j<row;j++)
         {
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++)
         {
            if(i==row||j==1||j==i){
             System.out.print("*");
             }else{
             System.out.print(" ");
             }
         }
         System.out.println("");
	 }
}	 
//PYRAMID STAR PATTERN	

	static void pyramid(int row){

       int k = 2*row - 2; 
   
        for (int i=0; i<row; i++) 
        { 
            for (int j=0; j<k; j++) 
            { 
                System.out.print(" "); 
            } 
            k = k - 1; 
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print("* "); 
            } 
            System.out.println(); 
		}
	}
			
//HOLLOW PYRAMID STAR PATTERN	
static void hollowPyramid(int row){
			
        for (int i = 1; i <= row; i++)
        {
         
            for (int j = i; j < row; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k < 2*i; k++)
            {
             
                if (i == row || (k == 1 || k == 2*i - 1)) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
            
            System.out.println(); 
}
}
			
//INVERTED PYRAMID STAR PATTERN
static void invertedPyramid(int row){
        for (int i = row; i >= 1; i--)
        {
            for (int j = row; j > i; j--) {
                System.out.print(' ');
            }

           
            for (int k = 1; k < 2*i; k++) {
                System.out.print('*');
            }
            System.out.println(); 
		}
}		
//HOLLOW INVERTED PYRAMID STAR PATTERN
static void hollowInvertedPyramid(int row){   
       for (int i = row; i >= 1; i--)
        {
            for (int j = row; j > i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k < 2*i; k++) {
            
                if (i == row || (k == 1 || k == 2*i - 1)) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }

           
            System.out.println(); 
		}
}
			
//HALF DIAMOND STAR PATTERN
static void halfDiamondStar(int row){

     for(int i=1;i<=row;i++)
     {
         for(int j=1;j<=i;j++)
         {
             System.out.print("*");
         }
         System.out.println("");
     } 
 for(int i=row;i>=1;i--)
     {
         for(int j=1;j<i;j++)
         {
             System.out.print("*");
         }
         System.out.println("");
     } 
          
            System.out.println(); 
}
			
//MIRRORED HALF DIAMOND STAR PATTERN			
static void mirroredHalfDiamond(int row){
 for(int i=1;i<=row;i++)
     {
         for(int j=i;j<row;j++)
         {
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++)
         {
             System.out.print("*");
         }
         System.out.println("");
     } 
 for(int i=row;i>=1;i--)
     {
         for(int j=i;j<=row;j++)
         {
             System.out.print(" ");
         }
         for(int j=1;j<i;j++)
         {
             System.out.print("*");
         }
            
            System.out.println(); 
	 }
}
}
