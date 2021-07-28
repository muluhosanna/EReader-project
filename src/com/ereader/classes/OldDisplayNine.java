package com.ereader.classes;

public class OldDisplayNine extends AbstractOldDisplay {
    public OldDisplayNine( EReaderColor color) {
        super(new TouchOnly(), color);
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
    public float getPrice(){return 160.99f;}

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
        return true;
    }

    @Override
    public boolean getIsHeadphoneJackSupported() {
        return true;
    }

    //@Override
   // public void paint(EReaderColor color) {return null;}

    @Override
    public int getSize() {
        return 9;
    }

    @Override
    public int getUpcNumber() {
        return 858532;
    }

  /*  @Override
    public String getSerialNumber() {
        return null;
    }*/

    @Override
    public String getModel() {
        return "E443400";
    }

    @Override
    public boolean getIsBattryReplaceble() {
        return true;
    }


    @Override
    public int getCountNumber() {
        return 4476;
    }


}
