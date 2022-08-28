package com.nettyJuc.day26_Singleton;

public class hungry {
    private hungry(){

    }
    private static final hungry hungry = new hungry();
    public static hungry gethungry(){
        return hungry;
    }
}


class lazy {
    private lazy(){

    }
    private static lazy lazy;
    public static synchronized lazy getlazy(){
        if (lazy == null){
            return new lazy();
        }
        return lazy;
    }
}



class lazyDouble {
    private lazyDouble(){

    }
    private static volatile lazyDouble lazydouble;
    public static synchronized lazyDouble getlazy(){
        synchronized (lazyDouble.class){
            if (lazydouble == null){
                return new lazyDouble();
            }
        }
        return lazydouble;
    }
}



