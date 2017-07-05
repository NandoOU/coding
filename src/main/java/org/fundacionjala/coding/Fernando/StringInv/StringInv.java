package org.fundacionjala.coding.Fernando.StringInv;

/**
 * Write a description of class StringInv here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class StringInv {
    static final int CANT_MAJOR = 5;

    /**
     * @param text param.
     * @return String param.
     */
    public String stringInv(final String text) {
        int pos = 0;
        String[] parts = text.split(" ");
        while (pos < parts.length) {
            if (parts[pos].length() > CANT_MAJOR) {
                parts[pos] = new StringBuilder(parts[pos]).reverse().toString();
            }
            pos++;
        }
        return String.join(" ", parts);

    }

}