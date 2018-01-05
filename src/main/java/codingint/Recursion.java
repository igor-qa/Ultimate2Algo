package codingint;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by borisgurtovyy on 11/11/17.
 */
public class Recursion {

    public int fibbonachi(int n){
        if(n <= 2){
            return 1;
        }
        return fibbonachi(n-1) + fibbonachi(n-2);
    }
    @Test
    public void testFibNumb(){
        System.out.println(fibbonachi(5));
    }



    public int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    @Test
    public void testFactorial(){
        System.out.println(factorial(5));
    }


    public boolean polyndrom(String s){

        if(s.length() < 2){
            return true;
        }

        if(s.charAt(0) == s.charAt(s.length()-1)){
            return polyndrom(s.substring(1,s.length()-1));
        }
        else {
            return false;
        }
    }

    @Test
    public void testPoly(){
        System.out.println(polyndrom("HelloVleH"));
    }

    public int sumOfDigits(int n){

        if (n<10){
            return n;
        }

        int cuttedDigit = n%10;
        int leftDigits = n/10;

        return cuttedDigit + sumOfDigits(leftDigits);
    }

    @Test
    public void testSumOfDig(){
        System.out.println(sumOfDigits(1538));
    }


    public int binarySearch(int[] arr, int target, int left, int right){

        if (left>right){
            return -1;
        }

        int middle = left + (right - left)/2;
        if(target == arr[middle]){
            return middle;
        }
        if(target < arr[middle]){
            right = middle - 1;
        }
        else {
            left = middle + 1;
        }

        return binarySearch(arr, target, left, right);


    }

    @Test
    public void testBinSearh() {
        int[] arr = {2, 4, 6, 8, 10, 15, 35, 69, 100};
        int target = 200;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }


    Set<Integer> set = new HashSet<Integer>();

    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }

        int sum = 0;
        while(n>0) {
            int digit = n % 10;
            n /= 10;
            sum = sum + digit * digit;
        }
        if(set.contains(sum)){
            return false;
        }
        set.add(sum);
        return isHappy(sum);

    }


    @Test
    public void testIsHappy(){
        System.out.println(isHappy(19));
    }
}
