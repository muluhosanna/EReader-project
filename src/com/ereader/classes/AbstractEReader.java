package com.ereader.classes;

public abstract class AbstractEReader implements EReaderInterface {
    private ScreenInterface screen;
    private EReaderColor color;
    private int size;
    private float price;

   protected String SerialNumber;

    protected AbstractEReader(ScreenInterface screen, EReaderColor color){
        this.screen = screen;
        this.color = color;
    }
    protected AbstractEReader(ScreenInterface screen){
        this.screen = screen;
    }

    public void setSerialNumber(String serial){
        this.SerialNumber = serial;
    }
    public String getSerialNumber(){
        return SerialNumber;
    }
    public abstract boolean getIsGpsSupported();
    public ScreenInterface getScreen(){return screen;}
    public abstract boolean getIsWifiSupported();
   public abstract boolean getIsSdCardReaderSupported();
    public abstract boolean getAndroid();
   public abstract boolean getIsGameInstalled();
   public abstract boolean getIsHeadphoneJackSupported();
public void paint(EReaderColor color){
    this.color = color;
}
    public abstract int getSize();
public abstract float getPrice();
public abstract int getUpcNumber();
    public abstract String getModel();
    public boolean getISGameInstalled() {
        return false;
    }

    public abstract boolean getIsBattryReplaceble();
   public abstract int getCountNumber();
   @Override
   public String toString(){
       String price = String.format("%21s", "$"+getPrice());
       return getClass().getSimpleName() + price +"  " + "\nUpc" + getUpcNumber() +
               "\nSerialnumber" + "" + getSerialNumber()+ "\n" +
               "color" + " "  + color +"\nModel" +getModel()+ "\n" +
               screen  ;
       /*
        String price = String.format("%21s", "$"+getPrice());
        return getClass().getSimpleName() + price +"\nModel #" +getModel()
                +"\n"+ wheel + "\n"+
                color + " frame\n" + "Serial # "+ getSerialNumber();
        */
   }



}
