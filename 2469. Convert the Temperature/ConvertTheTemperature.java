/**
 * https://leetcode.com/problems/convert-the-temperature/
 * You are given a non-negative floating point number rounded to two decimal places celsius,
 * that denotes the temperature in Celsius. You should convert Celsius into Kelvin and Fahrenheit and return it as an
 * array ans = [kelvin, fahrenheit].
 * <p>
 * Return the array ans. Answers within 10-5 of the actual answer will be accepted.
 */
public class ConvertTheTemperature {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15d;
        double fahrenheit = (celsius * 1.80) + 32.00d;
        return new double[]{kelvin, fahrenheit};
    }
}
