class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sumOfDigits = sumOfDigits(x);
        if (x % sumOfDigits == 0) {
            return sumOfDigits;
        } else {
            return -1;
        }
    }
    
    // function to calculate the sum of digits
    public int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
