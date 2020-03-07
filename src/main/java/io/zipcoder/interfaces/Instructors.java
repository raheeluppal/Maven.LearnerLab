package io.zipcoder.interfaces;

public final class Instructors extends People {

    private static Instructors Instance;
    private Instructors(){
        Instructor dolio = new Instructor(1L,"Dolio");
        Instructor roberto = new Instructor(2L,"Roberto");
        Instructor nobels = new Instructor(3L,"Nobels");
        Instructor kris = new Instructor(4L,"Kris");
        add(dolio);
        add(roberto);
        add(nobels);
        add(kris);
    }

    static{
        try{
            Instance = new Instructors();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Instructors getInstance() {

        return Instance;
    }

}
