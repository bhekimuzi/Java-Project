package za.co.reverside.training.p01;

public class TestConditions {
    
    public static void main(String[] args) {
        // TODO code application logic here

        Conditions con = new Conditions();
        System.out.println("Exercise 1");
        System.out.println("The largest number is:" + con.findLargest(30, 200, 4));
        System.out.println("=======================\nExercise 2");
        System.out.println("The second largest number is:" + con.findSecond(90, 20, 5));
        System.out.println("=======================\nExercise 3");
        System.out.println("The largest number among 7 numbers is:" + con.findLargest(10, 30, 15, 2, 900, 50, 100));
        System.out.println("=======================\nExercise 4");
        con.print(20);
        System.out.println("=======================\nExercise 5");
        System.out.println(con.checkNumber(-5));
        System.out.println("=======================\nExercise 6");
        System.out.println(con.evenOdd(15));
        System.out.println("=======================\nExercise 7");
        System.out.println(con.leapYear(2016));
        
        int nums[] = {10, 30, 15, 2, 900, 50, 100};
        
    }
    
}
