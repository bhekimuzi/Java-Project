
package za.co.reverside.training.p03;


public class TestStar {
     public static void main(String[] args) {
     Star star = new Star();
     int row=5;
     System.out.println("Exercise 1");
     star.squareStar(row);
      System.out.println("\n=======================\nExercise 2");
     star.hollowSquare(row);
      System.out.println("\n=======================\nExercise 3");
      star.hollowSquareStar(row);
      System.out.println("\n=======================\nExercise 4");
      star.rhombusStar(row);
      System.out.println("\n=======================\nExercise 5");
      star.hollowRhombus(row);
      System.out.println("\n=======================\nExercise 6");
      star.mirroredRhombus(row);
      System.out.println("\n=======================\nExercise 7");
      star.hollowMirroredRhombus(row);
      System.out.println("\n=======================\nExercise 8");
     }
}
