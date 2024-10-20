package com.corejava.designpattern;

public class SingletonPatternBillPugh {

    //1.static inner class responsible for holding the Singleton instance
    private static class SingletonHelper{
        //The Singleton instance is created only when this class is loaded
        private static final SingletonPatternBillPugh INSTANCE= new SingletonPatternBillPugh();
    }

    //2.private constructor to prevent init
    private SingletonPatternBillPugh(){
        if (SingletonHelper.INSTANCE!=null){
            throw new IllegalStateException("Instance is already created");
        }
    }

    //3.public method to provide access to the singleton instance
    public static SingletonPatternBillPugh getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
