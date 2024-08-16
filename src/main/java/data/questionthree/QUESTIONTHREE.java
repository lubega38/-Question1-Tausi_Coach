/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package data.questionthree;

/**
 *
 * @author LUBEGA
 */
public class QUESTIONTHREE {

     public static void main(String[] args) {
        int totalDistance = 10000; // Total distance from Kampala to Kabale
        int passengerStop = 150; // Stops for loading/unloading passengers
        int refuelStop = 200; // Stops for refueling

        int lcm = lcm(passengerStop, refuelStop);
        int numStops = totalDistance / lcm;

        System.out.println("The train will stop " + numStops + " times between Kampala and Kabale.");
    }

    // Helper method to calculate the greatest common divisor (GCD)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper method to calculate the least common multiple (LCM)
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}

