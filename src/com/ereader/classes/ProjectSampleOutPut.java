package com.ereader.classes;

public class ProjectSampleOutPut {
    public static void main(String[] args){
        testSerialGen();

    }
    public static void testSerialGen(){
        ElnkSeven mySeven = new ElnkSeven(new ButtonOnly(),EReaderColor.BLUE);
        SerialNumberGenerator mySerial = SerialNumberGenerator.getInstance();
        mySerial.setUpcNumberAndCount(mySeven.getUpcNumber(),mySeven.getCountNumber());
        mySeven.setSerialNumber(mySerial.getNextSerial());
        System.out.println("Next Serial is" + mySerial.getNextSerial());
        System.out.println("Next serial is " + mySerial.getNextSerial());
        System.out.println("Next serial is " + mySerial.getNextSerial());

    }
}
