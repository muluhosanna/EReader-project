package com.ereader.classes;

public class ElnkSeven extends Elnk{
    public ElnkSeven( EReaderColor color){
        super(new Button(), color);
    }

    @Override
    public boolean getIsGpsSupported() {
        return true;
    }
    @Override
    public float getPrice(){ return 169f;
    }

    @Override
    public boolean getIsWifiSupported() {
        return true;
    }

    @Override
    public boolean getIsSdCardReaderSupported() {
        return true;
    }

    @Override
    public boolean getAndroid() {
        return true;
    }

    @Override
    public boolean getIsGameInstalled() {
        return false;
    }

    @Override
    public boolean getIsHeadphoneJackSupported() {
        return true;
    }

    //public void paint(EReaderColor color) { return null; }

    @Override
    public int getSize(){
        return 7;
    }

    @Override
    public int getUpcNumber() {
        return 753901 ;
    }

   /* @Override
    public String getSerialNumber() {
        return null;
    }*/

    @Override
    public String getModel() {
        return "E332019";
    }

    @Override
    public boolean getIsBattryReplaceble() {
        return false;
    }

    @Override
    public int getCountNumber() {
        return 7593;
    }
}
