/* This program calculates the mean, variance, and standard deviation of a sample.
 */
package javaapplication2;
/**
 * @author Woody Clermont
 */
public class JavaApplication2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input; // The user’s input.
        double obs; // The input converted into an observation.
        double sum; // The total of all numbers entered.
        double mean; // The average of the numbers.
        double sumsquares; // The total of all squared deviations.
        double variance; // The variance.
        double stdev; // The standard deviation.
        double[] number; // An array used to contain first all entered numbers, then the squared deviations.
        number = new double[100]; // Creates new array of type double with length 100.
        int n; // The number of numbers entered.
        variance = 0;
        stdev = 0;
        sumsquares = 0;
        obs = 0;
        n = 0;
        sum = 0;
        System.out.println("Enter your numbers, press return to end (no more than 100 entries).");
        while (true) {
        System.out.print(n+1+"? ");
        input = TextIO.getln();
        if (input.equals("")) {
            break; // Exit the loop, since the input line was blank.
        }
        try {
            obs = Double.parseDouble(input); // If an error occurs, the next section is skipped!
            sum += obs;
            number[n] = obs;
            n++;
            if (n==100) {
                break; // Exit the loop, we have reached maximum.
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Not a legal number! Try again.");
        }
        }
        mean = sum/n;
        for ( int i = 0; i < n; i++ ) {
            number[i] = Math.pow((number[i]-mean),2);
            sumsquares += number[i];
        }
        variance = sumsquares/(n-1);
        stdev = Math.pow(variance,0.5);
        System.out.printf("The sample mean (x bar) of %d numbers is %1.6g.%n",n,mean);
        System.out.println("The sample variance (s squared) is "+variance+" and the sample standard deviation (s) is "+stdev+".");
    }
    
}