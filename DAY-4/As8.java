public class As8 {
    public static int countDivisibleByThree(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, 9, 10, 12};

        int result = countDivisibleByThree(numbers);

        System.out.println("Count of numbers divisible by 3: " + result);
    }
}



// Assignment 8: Function + Array – Count How Many Are Divisible by 3
// Question:
// Create a function that takes an array and returns how many numbers are divisible by 3.
// Input Format:
// [3, 4, 9, 10, 12]
// Output Format:
// Count of numbers divisible by 3: 3
