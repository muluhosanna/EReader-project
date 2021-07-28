package com.ereader.classes;

public interface EReaderInterface {

    boolean getIsWifiSupported();

    ScreenInterface getScreen();

    boolean getIsSdCardReaderSupported();

    boolean getAndroid();

    boolean getISGameInstalled();

    boolean getIsHeadphoneJackSupported();

    void paint(EReaderColor color);

    int getSize();
    float getPrice();

    int getUpcNumber();
   // String getSerialNumber();

    String getModel();

    boolean getIsBattryReplaceble();

    int getCountNumber();

}
