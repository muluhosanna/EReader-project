package com.ereader.classes;

import java.util.ArrayList;

public class ProjectSampleOutPut {
    public static void main(String[] args){
       // testSerialGen();
        //testElnk9();
       // tesInventory();
        testProjectOrder();
       // testList();

    }
    public static void testList(){
        ProjectInventory inventory = new ProjectInventory();
        ArrayList<EReaderInterface>eReader1= new ArrayList<>();
        eReader1.add(inventory.getOldTwelveList().get(2));

        ProjectSampleReceipt test = new ProjectSampleReceipt(eReader1);
      //  eReader1.add(new ElnkSeven(EReaderColor.BLACK));

       // eReader1.add(inventory.getSevenList().get(3));
    }
    public static void testProjectOrder(){
        ProjectSampleOrder myOrder = new ProjectSampleOrder();
        myOrder.welcomeMessage();
        myOrder.buyEReader();

    }
    public static void tesInventory(){
       ProjectInventory inventory = new ProjectInventory();
       //ElnkSeven mySeven = new ElnkSeven(new Button(),EReaderColor.BLUE);
      inventory.buildElnkSevenInventory();
      inventory.buildELnkNineInventory();
      inventory.buildElnkTwelveInventory();
      inventory.buildOldDisplaySevenInventory();
      inventory.buildOldDisplayNineInventory();
      inventory.buildOldDisplayTwelveInventory();
      for (ElnkSeven mySeven : inventory.getSevenList()){
          System.out.println(mySeven.getSerialNumber());

      }
        System.out.println();

      for (ElnkNine myNine : inventory.getNineList()){
         System.out.println(myNine.getSerialNumber());
      }
        System.out.println();
      for (ElnkTwelve myTwelve : inventory.getTwelvesList()){
          System.out.println(myTwelve.getSerialNumber());
      }
        System.out.println();
      for (OldDisplaySeven myOldSeven : inventory.getOldSevenList()){
          System.out.println(myOldSeven.getSerialNumber());
      }
        System.out.println();
      for (OldDisplayNine myOldNine : inventory.getOldNineList()){
          System.out.println(myOldNine.getSerialNumber());
      }
        System.out.println();
      for (OldDisplayTwelve myOldTwelve : inventory.getOldTwelveList()){
          System.out.println(myOldTwelve.getSerialNumber());
      }
    }
    public static void testElnk9(){
        ElnkNine myNine1 = new ElnkNine(EReaderColor.BLUE) ;
        System.out.println( "Is the operating system for this E-reader Android ? " + myNine1.getAndroid() );
        System.out.println( "The model of this E-Reader is " +myNine1.getModel());
        System.out.println(myNine1.getIsHeadphoneJackSupported());
       // System.out.println(myNine1.getSize());
        System.out.println( "This E-reader is  " + myNine1.getScreen() + " " + "With Screen size " + myNine1.getSize());
        System.out.println(myNine1);

    }
    public static void testSerialGen(){
        ElnkSeven mySeven = new ElnkSeven(EReaderColor.BLUE);
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
