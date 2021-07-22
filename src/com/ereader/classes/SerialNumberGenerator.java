package com.ereader.classes;

public class SerialNumberGenerator {
    private static SerialNumberGenerator one;
    private static int UpcNumber;
    private static int  count;

    public static synchronized SerialNumberGenerator getInstance() {
        //modelNumber = model;
        //start = startNumber;
        if (one == null) {
            one = new SerialNumberGenerator();
        }
        return one;
    }
    private SerialNumberGenerator(){}

    public synchronized void setUpcNumberAndCount(int upcNumber, int CountNumber) {
        UpcNumber =UpcNumber;
        count = CountNumber;
    }

    public synchronized long getNextSerial(){return UpcNumber + ++count;}
    public synchronized int getRecentNumber(){ return count;}
}
