package com.ereader.classes;

public abstract class AbstractScreen implements ScreenInterface {
    private boolean screenControl;
    private int size;
    public AbstractScreen(boolean screenControl){this.screenControl = screenControl;}
  //public abstract int getSize();
    public AbstractScreen(boolean screenControl,int size){
        this.screenControl = screenControl;
        this.size = size;
    }

    @Override
   public boolean isButton(){
        return screenControl;
    }

    @Override
public String toString(){
        return getClass().getSimpleName() ;

}

}
