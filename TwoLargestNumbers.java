
import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[5];
    
    for (int i =0; i <5; i++) {
    numbers[i] = scanner.nextInt();
    }
    
    int firstMax = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    
    for (int number : numbers) {
    if (number > firstMax) {
    secondMax = firstMax;
    firstMax = number;
    } else if (number > secondMax && number != firstMax) {
    secondMax = number;
    }
    }
    
    System.out.println("Output: " + firstMax + " " + secondMax);
    scanner.close();
    }
    }
