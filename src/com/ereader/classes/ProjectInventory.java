package com.ereader.classes;

import java.util.ArrayList;

public class ProjectInventory {
    private ArrayList<ElnkSeven> sevenList;
    private ArrayList<ElnkNine> nineList;
    private ArrayList<ElnkTwelve> twelvesList;
    private ArrayList<OldDisplaySeven> oldSevenList;
    private ArrayList<OldDisplayNine> oldNineList;
    private ArrayList<OldDisplayTwelve> oldTwelveList;
    private SerialNumberGenerator generator;

    public ProjectInventory(){
       sevenList = new ArrayList<>();
       nineList = new ArrayList<>();
       twelvesList = new ArrayList<>();
       oldSevenList = new ArrayList<>();
       oldNineList  = new ArrayList<>();
       oldTwelveList = new ArrayList<>();
       generator = SerialNumberGenerator.getInstance();
    }
    public ArrayList<ElnkNine> getNineList(){ return nineList; }
    public ArrayList<ElnkTwelve> getTwelvesList(){return twelvesList;}
    public ArrayList<OldDisplaySeven> getOldSevenList(){return oldSevenList;}

    public ArrayList<OldDisplayNine> getOldNineList() {
        return oldNineList;
    }

    public ArrayList<OldDisplayTwelve> getOldTwelveList() {
        return oldTwelveList;
    }

    public ArrayList<ElnkSeven> getSevenList(){ return sevenList; }
    public SerialNumberGenerator getGenerator(){ return generator; }
    public void buildElnkSevenInventory() {
        ArrayList<ElnkSeven> list = new ArrayList<>();
        ElnkSeven seven = new ElnkSeven(new Button(),EReaderColor.ROSEGOLD);
        generator.setUpcNumberAndCount(seven.getUpcNumber(), seven.getCountNumber());

        for (int i = 0; i <= 10; i++) {

            seven = new ElnkSeven(new Button(), EReaderColor.ROSEGOLD);
            seven.setSerialNumber(generator.getNextSerial());
             list.add(seven);
            // System.out.println("size is " + seven.getSize());
           // System.out.println(list);
        }
        sevenList.addAll(list);


    }
    public void buildELnkNineInventory(){
        ArrayList<ElnkNine> list2 = new ArrayList<>();
        ElnkNine nine = new ElnkNine(new ButtonAndTouch(), EReaderColor.WHITE);
        generator.setUpcNumberAndCount(nine.getUpcNumber(),nine.getCountNumber());
        for (int i=0; i<=10;i++){
            nine = new ElnkNine(new ButtonAndTouch(), EReaderColor.WHITE);
            nine.setSerialNumber(generator.getNextSerial());
            list2.add(nine);
        }
        nineList.addAll(list2);

    }
    public void buildElnkTwelveInventory(){
        ArrayList<ElnkTwelve> list3 = new ArrayList<>();
        ElnkTwelve twelve = new ElnkTwelve(new TouchOnly(),EReaderColor.BLACK);
        generator.setUpcNumberAndCount(twelve.getUpcNumber(),twelve.getCountNumber());
        for (int i = 0; i <= 10; i++){
            twelve = new ElnkTwelve(new TouchOnly(),EReaderColor.BLACK);
            twelve.setSerialNumber(generator.getNextSerial());
            list3.add(twelve);
        }
        twelvesList.addAll(list3);

    }
    public void buildOldDisplaySevenInventory(){
        ArrayList<OldDisplaySeven>list4 = new ArrayList<>();
        OldDisplaySeven oldSeven = new OldDisplaySeven(new ButtonAndTouch(),EReaderColor.CANDY);
        generator.setUpcNumberAndCount(oldSeven.getUpcNumber(),oldSeven.getCountNumber());
        for (int i = 0; i <=10; i++){
            oldSeven = new OldDisplaySeven(new ButtonAndTouch(),EReaderColor.CANDY);
            oldSeven.setSerialNumber(generator.getNextSerial());
            list4.add(oldSeven);
        }
        oldSevenList.addAll(list4);
    }
    public void buildOldDisplayNineInventory(){
        ArrayList<OldDisplayNine>list5 = new ArrayList<>();
        OldDisplayNine oldNine = new OldDisplayNine(new TouchOnly(),EReaderColor.BLUE);
        generator.setUpcNumberAndCount(oldNine.getUpcNumber(),oldNine.getCountNumber());
        for (int i = 0; i <=10; i++){
            oldNine = new OldDisplayNine(new TouchOnly(),EReaderColor.BLUE);
            oldNine.setSerialNumber(generator.getNextSerial());
            list5.add(oldNine);
        }
        oldNineList.addAll(list5);

    }
    public void buildOldDisplayTwelveInventory(){
        ArrayList<OldDisplayTwelve>list6 = new ArrayList<>();
        OldDisplayTwelve oldTwelve = new OldDisplayTwelve(new TouchOnly(),EReaderColor.BLUE);
        generator.setUpcNumberAndCount(oldTwelve.getUpcNumber(),oldTwelve.getCountNumber());
        for (int i = 0; i <=10;i++){
            oldTwelve = new OldDisplayTwelve(new TouchOnly(),EReaderColor.BLUE);
            oldTwelve.setSerialNumber(generator.getNextSerial());
            list6.add(oldTwelve);

        }
        oldTwelveList.addAll(list6);
    }

}

