package com.ereader.classes;

public class ElnkTwelve extends Elnk{
    public ElnkTwelve(ScreenInterface screen,EReaderColor color){
        super(screen,color);
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

    @Override
    public Void paint(EReaderColor color) {
        return null;
    }

    @Override
    public int getSize() {
        return 12;
    }

    @Override
    public int getUpcNumber() {
        return 153790;
    }

   /* @Override
    public String getSerialNumber() {
        return null;
    }*/

    @Override
    public String getModel() {
        return "E674019";
    }


    @Override
    public boolean getIsBattryReplaceble() {
        return false;
    }

    @Override
    public int getCountNumber() {
        return 3276;
    }
}
