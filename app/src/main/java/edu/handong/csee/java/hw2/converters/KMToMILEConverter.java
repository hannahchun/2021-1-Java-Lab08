package edu.handong.csee.java.hw2.converters;

/**
 * This is a public class KMtoMILEConverter that implements Convertible interface
 */
public class KMToMILEConverter implements Convertible{
    private double pvalue;
    private double result;

    /**
     * This is a public method called setFromValue that sets original value
     * @param fromValue one double type value 
     */
    public void setFromValue(double fromValue){
        pvalue=fromValue;
    }

    /**
     * This is a public method called getConvertedValue that returns a result
     * @return one double type value 
     */
    public double getConvertedValue(){
        return result;
    }

    /**
     * This is a public method called convert that converts the orignal value to the result we want to see
     */
    public void convert(){
        result=pvalue/1.6;
    }
}
