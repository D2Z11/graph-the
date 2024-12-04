class Utility {
    private Utility() {

    }

    public static int fibSequence(int index) {
        int lastNumber = 0;
        int currNumber = 1;
        int i = 0;
        while (i < index) {
            lastNumber = currNumber;
            currNumber = lastNumber + currNumber;
            i++;
        }
        // System.out.println(currNumber);
        return currNumber;
    }

    // Using number theory!
    private static boolean isDivisibleBy(String number, int divisor) {
        if (divisor == 2) {
            return (Integer.parseInt(number.substring(number.length() - 1)) % 2 == 0);
        }
        else if (divisor == 9) {
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                // https://stackoverflow.com/questions/46343616/how-can-i-convert-a-char-to-int-in-java
                sum += number.charAt(i) - '0';
            }
            return (sum%9==0);
        }
        return (Integer.parseInt(number)%(divisor)==0);
    }

    public static String factorize(int number) {
        String sum = "1";
        int[] primes = {2, 3, 5};
        while (number > 10) {
            String strNum = String.valueOf(number);
            for (int i = 0; i < primes.length; i++) {
                //A
                if (isDivisibleBy(strNum, primes[i])) {
                    number /= primes[i];
                    sum += "*" + primes[i];
                }
            }
        }
        return sum;
    }
}