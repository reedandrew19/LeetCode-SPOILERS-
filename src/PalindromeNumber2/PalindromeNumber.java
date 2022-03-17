package PalindromeNumber2;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int numberCopy = x;
        int remainder = 0;
        int reversedNumber = 0;

        if(x < 0){
            return false;
        }

        while(numberCopy != 0){
            remainder = numberCopy % 10;
            reversedNumber *= 10;
            reversedNumber += remainder;
            numberCopy /= 10;
        }

        return x == reversedNumber;
    }

    public static boolean isPalindromeBetter(int x) {
        int remainder;
        int reversedNumber = 0;

        if(x < 0 || (x % 10 == 0 && x > 0)){
            return false;
        }

        while(x > reversedNumber){
            remainder = x % 10;
            reversedNumber *= 10;
            reversedNumber += remainder;
            x /= 10;
        }

        return x == reversedNumber || reversedNumber / 10 == x;
    }
}

/*
This was a tough one. I thought about converting the integer to a string or array and comparing the outermost indices
until they overlap or meet, but I knew there was a way to do it without changing data structures. I remember it had
something to do with the mod operation to find the remainder, but I forgot that integer division by 10 chops off the
least significant figure.

Once I had this, I knew how to do the problem without converting it, but I couldn't think of how to early terminate once
you reverse half of the string. I DEFINITELY wouldn't have thought of an early false return if the number ends in 0.
Especially because my first solution worked perfectly the first time, I didn't think about adding test cases when I
changed the algorithm. Sometimes you have to think a little bit more about edge cases before you start coding.
 */