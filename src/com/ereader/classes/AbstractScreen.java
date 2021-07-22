package com.ereader.classes;

public abstract class AbstractScreen implements ScreenInterface {
    private boolean screenControl;
    public AbstractScreen(boolean screenControl){this.screenControl = screenControl;}
   public abstract int getSize();
    @Override
   public boolean isButtonOnly(){
        return screenControl;
    }

    @Override
public String toString(){
        return getClass().getSimpleName() + getSize() + "inchs";

}

}
