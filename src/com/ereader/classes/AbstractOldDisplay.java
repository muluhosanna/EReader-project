package com.ereader.classes;

public abstract class AbstractOldDisplay extends AbstractEReader {
    protected AbstractOldDisplay(ScreenInterface screen,EReaderColor color){
        super(screen,color);
    }
    protected AbstractOldDisplay(ScreenInterface screen){super(screen);}

}
