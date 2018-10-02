package za.co.reverside.training.p01;

public class Conditions {

    public int findLargest(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public int findSecond(int num1, int num2, int num3) {
        if (num1 > num2 && num2 > num3) {
            return num2;
        } else if (num2 > num3 && num3 > num1) {
            return num3;
        } else {
            return num1;
        }
    }

    public int findLargest(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
        int num = 0;
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5 && num1 > num6 && num1 > num7) {
            num = num1;
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 && num2 > num6 && num2 > num7) {
            num = num2;
        } else if (num3 > num1 && num3 > num4 && num3 > num5 && num3 > num6 && num3 > num7) {
            num = num3;
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 && num4 > num6 && num4 > num7) {
            num = num3;
        } else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4 && num5 > num6 && num5 > num7) {
            num = num5;
        } else if (num6 > num1 && num6 > num2 && num6 > num3 && num6 > num4 && num6 > num5 && num6 > num7) {
            num = num6;
        } else if (num7 > num1 && num7 > num2 && num7 > num3 && num7 > num4 && num7 > num6 && num7 > num5) {
            num = num7;
        }
        return num;
    }

    public void print(int num) {
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            }else
            if (i % 3 == 0) {
                System.out.println("FIZZ");
            }else
            if (i % 5 == 0) {
                System.out.println("BUZZ");
            }else{
                System.out.println(i);
            }
            
        }
      
    }
    public String checkNumber(int num){
String message="";
     if(num>0){
         message=num+" is positive";
     }else if(num<0){
      message=num+" is negative";
     }else{
       message=num+" is zero";
     }
	 return message;
	 }
    public String evenOdd(int num){
	String message="";
if(num%2==0){
         message=num+" is even";
     }else{
      message=num+" is odd";
     } 
	 return message;
}
    public String leapYear(int year){
        boolean leap = false;
String message="";
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0){
                    leap = true;
                }else{
                    leap = false;
            }
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap){
           message=year + " is a leap year.";
		}
        else{
            message=year + " is not a leap year.";
		}
		return message;
}

}
