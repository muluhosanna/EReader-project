package com.ereader.classes;

public class ProjectSampleOutPut {
    public static void main(String[] args){
        //testSerialGen();
        testElnk9();

    }
    public static void testElnk9(){
        ElnkNine myNine1 = new ElnkNine(new ButtonAndTouch(), EReaderColor.CANDY) ;
        System.out.println( "Is the operating system for this E-reader Android ? " + myNine1.getAndroid() );
        System.out.println( "The model of this E-Reader is " +myNine1.getModel());
        System.out.println(myNine1.getIsHeadphoneJackSupported());
       // System.out.println(myNine1.getSize());
        System.out.println( "This E-reader is  " + myNine1.getScreen() + " " + "With Screen size " + myNine1.getSize());
        System.out.println(myNine1);

    }
    public static void testSerialGen(){
        ElnkSeven mySeven = new ElnkSeven(new Button(),EReaderColor.BLUE);
        SerialNumberGenerator mySerial = SerialNumberGenerator.getInstance();
        mySerial.setUpcNumberAndCount(mySeven.getUpcNumber(),mySeven.getCountNumber());
       // mySeven.setSerialNumber(mySerial.getNextSerial());
        mySeven.setSerialNumber(mySerial.getNextSerial());
        System.out.println(mySeven.getSerialNumber());
        System.out.println("Next Serial is" + mySerial.getNextSerial());
        System.out.println("Next serial is " + mySerial.getNextSerial());
        System.out.println("Next serial is " + mySerial.getNextSerial());

    }
}
