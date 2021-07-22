package com.ereader.classes;

public abstract class AbstractEReader implements EReaderInterface {
    private ScreenInterface screen;
    private EReaderColor color;
    private int size;

   protected long SerialNumber;

    protected AbstractEReader(ScreenInterface screen, EReaderColor color){
        this.screen = screen;
        this.color = color;
    }
    public void setSerialNumber(long serial){
        this.SerialNumber = serial;
    }
    public long getSerialNumber(){
        return SerialNumber;
    }
    public abstract boolean getIsGpsSupported();
    public ScreenInterface getScreen(){return screen;}
    public abstract boolean getIsWifiSupported();
   public abstract boolean getIsSdCardReaderSupported();
    public abstract boolean getAndroid();
   public abstract boolean getIsGameInstalled();
   public abstract boolean getIsHeadphoneJackSupported();
public abstract Void paint(EReaderColor color);
    public abstract int getSize();
public abstract int getUpcNumber();
    public abstract String getModel();
    public boolean getISGameInstalled() {
        return false;
    }

    public abstract boolean getIsBattryReplaceble();
   public abstract int getCountNumber();
   @Override
   public String toString(){
       return getClass().getSimpleName() + "  " + "\nSerialnumber" + getSerialNumber()+ "\n" +
               color +"Ereader" +"\nModel" +getModel()+ "\n" +
               screen + "Ereader" ;
   }


}
