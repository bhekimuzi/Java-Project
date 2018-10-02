package za.co.reverside.training.p02;

public class TestIterations {

    public static void main(String[] args) {
        Iterations iter = new Iterations();
        int[] num = {10, 70, 16, 88, 92, 100, 5, 15, 10, 10, 15};
        int number = 15;
        char letter='a';
        String name = "I love programming";
        String str = "1234";
        System.out.println("Exercise 1");
        System.out.println("The largest number is:" + iter.largestNumber(num));
        System.out.println("=======================\nExercise 2");
        System.out.println("The second largest number is:" + iter.secondLargestNumber(num));
        System.out.println("=======================\nExercise 3");
        System.out.println(iter.findNumber(num, number));
        System.out.println("=======================\nExercise 4");
        System.out.println("The number of occurence for number " + number + " is " + iter.findOccurrence(num, number));
        System.out.println("=======================\nExercise 5");
        System.out.println("The number with maximum occurence is " + iter.findMaximumOccurrence(num));
        System.out.println("=======================\nExercise 6");
        System.out.println("The number of space are: " + iter.findSpace(name));
        System.out.println("=======================\nExercise 7");
        System.out.println("The number of words are: " + iter.findWord(name));
        System.out.println("=======================\nExercise 8");
        System.out.println(iter.repalceSpace(name));
        System.out.println("=======================\nExercise 9");
        int[] arry = iter.sort(num);
        for (int i = 0; i < arry.length; i++) {
            System.out.print("\t" + arry[i]);

        }
        System.out.println("\n=======================\nExercise 10");
        iter.findEven(num);
        System.out.println("=======================\nExercise 11");
        iter.fibonaci(number);
        System.out.println("\n=======================\nExercise 12");
        System.out.println(iter.reverseString(name));
        System.out.println("=======================\nExercise 13");
        System.out.println(iter.convert(str));
        System.out.println("=======================\nExercise 14");
        System.out.println("The maximum diffrence is:" + iter.difference(num));
        System.out.println("=======================\nExercise 15");
        System.out.println("The number of digits in " + number + " is " + iter.countNumber(number));
        System.out.println("=======================\nExercise 16");
        System.out.println("The sum of digits in " + number + " is " + iter.calSum(number));
        System.out.println("=======================\nExercise 17");
        System.out.println("The sum of all odd number is: " + iter.calSum(num));
        System.out.println("=======================\nExercise 18");
        iter.swap(number);
        System.out.println("\n=======================\nExercise 19");
        System.out.println(letter+" "+iter.alphabet(letter));
        System.out.println("\n=======================\nExercise 20");
        System.out.println(iter.reverseNumber(number));
        

    }
}
