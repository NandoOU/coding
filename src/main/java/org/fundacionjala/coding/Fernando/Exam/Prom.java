package org.fundacionjala.coding.Fernando.Exam;

/**
 * Write a description of class Prom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prom {
    /**
     * Constructor.
     */
    public Prom() {
    }

    /**
     * @param num the method has a int value.
     * @return double value.
     */
    public double[] promedio(final int[] num) {
        double[] res = {};
        if (num != null && num.length != 0) {
            return promedio(num, 0);
        } else {
            return res;
        }

    }

    /**
     * @param num  the method has a int value.
     * @param pos1 param.
     * @return double value.
     */
    private double[] promedio(final int[] num, final int pos1) {
        double[] res = new double[num.length - 1];

        for (int pos = 0; pos < num.length - 1; pos++) {
            double primvalor = num[pos];
            double secondvalor = num[pos + 1];
            double prom = (primvalor + secondvalor) / 2;
            res[pos] = prom;
        }
        return res;

    }
}
