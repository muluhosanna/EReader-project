package com.ereader.classes;

public abstract class AbstractElnk extends AbstractEReader{
    protected AbstractElnk(ScreenInterface screen, EReaderColor color){
        super(screen, color);
    }
    protected AbstractElnk(ScreenInterface screen){super(screen);}
}
