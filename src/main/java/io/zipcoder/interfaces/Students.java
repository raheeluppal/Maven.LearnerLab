package io.zipcoder.interfaces;

public final class Students extends People {

    private static Students Instance;

    private Students() {
        Student raheel = new Student(1L,"Raheel");
        add(raheel);
        add(new Student(2L,"Han"));
        add(new Student(3L,"Moe"));
        add(new Student(4L,"Von"));
    }

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
