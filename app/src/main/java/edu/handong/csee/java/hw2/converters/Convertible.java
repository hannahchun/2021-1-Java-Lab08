package edu.handong.csee.java.hw2.converters;

/**
 * This is a public interface called Convertible that defines the methods that classes which implement this interface must use
 */
public interface Convertible {
    
    /**
     * This is a public method called setFromValue that sets original value
     * @param fromValue one double type value
     */
    public void setFromValue(double fromValue);

    /**
     * This is a public method called getConvertedValue that returns a result
     * @return one double type value 
     */
    public double getConvertedValue();

    /**
     * This is a public method called convert that converts the orignal value to the result we want to see
     */
    public void convert();

}