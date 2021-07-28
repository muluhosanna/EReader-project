package com.ereader.classes;

public class ElnkNine extends Elnk{
    public ElnkNine(EReaderColor color){
        super(new ButtonAndTouch(), color);
    }

    @Override
    public boolean getIsGpsSupported() {
        return true;
    }

    @Override
    public boolean getIsWifiSupported() {
        return true;
    }
    @Override
    public float getPrice(){ return 200f; }

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

    //@Override
    //public void paint(EReaderColor color) {return null;}

    @Override
    public int getSize() {
        return 9;
    }

    @Override
    public int getUpcNumber() {
        return 426852;
    }

  /*  @Override
    public String getSerialNumber() {
        return null;
    }*/

    @Override
    public String getModel() {
        return "E443019";
    }


    @Override
    public boolean getIsBattryReplaceble() {
        return false;
    }

    @Override
    public int getCountNumber() {
        return 6487;
    }
}
