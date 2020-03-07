package io.zipcoder.interfaces;

public final class Students extends People {

    private static Students Instance;

    private Students() {}

    static{
        try{
            Instance = new Students();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Students getInstance() {

        return Instance;
    }
}
