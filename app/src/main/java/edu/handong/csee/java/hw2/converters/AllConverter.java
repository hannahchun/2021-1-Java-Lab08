package edu.handong.csee.java.hw2.converters;

/**
 * This is a public class called AllConverter
 */
public class AllConverter {
    private double pvalue;
    private String original;
    private double fresult;
    private double sresult;

    /**
     * This is a public method called AllConverter that sets the original value and returns an object
     * @param fromValue a double type parameter 
     * @return a object 
     */
    public AllConverter setFromValue(double fromValue){
        pvalue=fromValue;
        return this;
    }

    /**
     * This is a public method called setOriginalMeasure that sets original measure
     * @param om a string type parameter 
     * @return a object 
     */
    public AllConverter setOriginalMeasure(String om){
        original=om;
        return this;
    }

    /**
     * This is a public method called convertAndPrintOut that converts the original value and prints the result 
     */
    public void convertAndPrintOut(){
        if(original.equals("KM")){
            fresult=pvalue*1000;
            sresult=pvalue/1.6;
            System.out.println(pvalue + " " + original + " " + "to" + " " + fresult + " " + "M");
            System.out.println(pvalue + " " + original + " " + "to" + " " + sresult + " " + "MILE");
        }
        else if(original.equals("TON")){
            fresult=pvalue*1000;
            sresult=pvalue*1000*1000;
            System.out.println(pvalue + " " + original + " " + "to" + " "+ fresult + " " + "KG");
            System.out.println(pvalue + " " + original + " " + "to" + " "+ sresult + " " + "G");
        }
        else{
            System.out.println("AllConverter cannot support the measure!");
        }
    }

}
