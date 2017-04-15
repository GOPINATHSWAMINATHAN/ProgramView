package com.ocean.java.interfaces;

public interface Application {
    public void androidApp();
    public void iosApp();
}

class App implements Application {
    
    @Override
    public void androidApp() {
        System.out.println("Android application");
    }
    @Override
    public void iosApp() {
        System.out.println("IOS application");
    }
    
    public static void main(String[] args) {
        App obj = new App();
        obj.androidApp();
        obj.iosApp();
    }
}
