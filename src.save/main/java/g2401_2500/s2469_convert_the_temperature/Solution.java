package g2401_2500.s2469_convert_the_temperature;

// #Easy #Math #2023_01_11_Time_0_ms_(100.00%)_Space_40.6_MB_(87.87%)

public class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        double[] arr = new double[2];
        arr[0] = kelvin;
        arr[1] = fahrenheit;
        return arr;
    }
}
