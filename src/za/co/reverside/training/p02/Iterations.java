package za.co.reverside.training.p02;

public class Iterations {

    public int largestNumber(int[] num) {
        int largest = num[0];

        for (int i = 0; i < num.length; i++) {

            if (num[i] > largest) {

                largest = num[i];

            }
        }
        return largest;
    }

    public int secondLargestNumber(int[] num) {
        int largest = num[0], secondLargest = num[0];

        for (int i = 0; i < num.length; i++) {

            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];

            } else if (num[i] > secondLargest) {
                secondLargest = num[i];

            }
        }
        return secondLargest;
    }

    public String findNumber(int[] row, int num) {
        String present = "";
        for (int i = 0; i < row.length; i++) {
            if (num == row[i]) {
                present = num + " is present";
                break;
            } else {
                present = num + " is not present";

            }
        }
        return present;
    }

    public int findOccurrence(int[] row, int num) {
        int res = 0;

        for (int i = 0; i < row.length; i++) {
            if (num == row[i]) {
                res++;
            }

        }
        return res;
    }

    public int findMaximumOccurrence(int[] row) {

        int max = 0;
        int x = 0;
        for (int i = 1; i < row.length; i++) {
            int num = 0;
            for (int j = 0; j < row.length; j++) {
                if (row[i] == row[j]) {
                    num++;
                }

            }
            if (num > max) {
                max = num;
                x = row[i];
            }
        }
        return x;
    }

    public int findSpace(String str) {

        int spaceCount = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    public int findWord(String str) {

        int spaceCount = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        int numOfWord = spaceCount + 1;
        return numOfWord;
    }

    public String repalceSpace(String str) {
        String newStr = "";
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                newStr = str.replace(' ', '_');
            }
        }

        return newStr;
    }

    public int[] sort(int[] num) {

        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int x = 0; x < num.length; x++) {

                if (num[i] < num[x]) {
                    temp = num[i];
                    num[i] = num[x];
                    num[x] = temp;
                }
            }

        }
        return num;
    }

    public void findEven(int[] num) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i] + " is an even number");
            }
        }
    }

    public void fibonaci(int n) {
        int t1 = 0, t2 = 1;
        while (t1 <= n) {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

    public String reverseString(String name) {
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        return reverse;
    }

    public int convert(String name) {

        int p = Integer.parseInt(name);
        return p;
    }

    public int difference(int[] num) {

int max=0;
        for (int i = 0; i <= num.length; i++) {
            if (i == num.length-1) {
                break;
            } else {
                if(num[i] - num[i + 1]>max)
                 max = num[i] - num[i + 1];
                
            }
        }
       return max; 
    }
    public int countNumber(int num1){
 int count = 0;

        while(num1 != 0)
        {
            // num = num/10
            num1 /= 10;
            ++count;
        }

       return count;
}
    public int calSum(int number){
 int sum=0,last=0;
 while(number > 0)
        {
            last = number % 10;
            sum = sum + last;
            
            number= number / 10;
             
        }
        return sum;
}
    public int calSum(int[] array){
int sum =0;
for(int i=0;i<array.length;i++){
	
	if(array[i]%2!=0){
		sum =sum+array[i];
	}
}
return sum;
}
    public int swap(int number){ 

 String myNum =String.valueOf(number);
 String output ="";
 int newNumber=0;
 if(myNum.length()==1){
 output=myNum;
 }else{
 char first =myNum.charAt(0);
 char myLast =myNum.charAt(myNum.length()-1);
 String remains =myNum.substring(1, myNum.length()-1);
 output =myLast+remains+first;
     System.out.println(output);
	  newNumber =Integer.parseInt(output);
	 
 }
 return newNumber;
    }
    public String alphabet(char letter){
 String message="";
 
 switch(letter){
     case 'A':case'a':
         message="Is Vowel";
         break;
     case 'E':case 'e':
         message="Is Vowel";
         break;
          case 'I':case 'i':
         message="Is Vowel";
         break;
          case 'O':case 'o':
         message="Is Vowel";
         break;
          case 'U':case 'u':
         message="Is Vowel";
         break;
         default:
             message="Is Consonant";
             break;
         
 }
  return message;
}
    public int reverseNumber(int number1){
int m=0,a=0,x=0;
    m = number1;
        while(number1 > 0)
        {
            x = number1 % 10;
            a = a * 10 + x;
            number1 = number1 / 10;
        }
      return a;
}
}
