package com.ereader.classes;

public class SerialNumberGenerator {
    private static SerialNumberGenerator serial1;
    private static int UpcNumber;
    private static int  count;

    public static synchronized SerialNumberGenerator getInstance() {
        //modelNumber = model;
        //start = startNumber;
        if (serial1 == null) {
            serial1 = new SerialNumberGenerator();
        }
        return serial1;
    }
    private SerialNumberGenerator(){}
    public synchronized void setUpcNumberAndCount(int upcNumber, int CountNumber) {
        UpcNumber =upcNumber;
        count = CountNumber;
    }

    public synchronized String getNextSerial(){return UpcNumber + "" + ++count;}
    public synchronized int getRecentNumber(){ return count;}
}
