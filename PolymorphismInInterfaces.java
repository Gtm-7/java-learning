package com.red_sandel;
interface MyCamera1{
    void takeSnap();
    void recordVideo();
    default void record4KVedio(){
        System.out.println("recording in 4k ");
    }
}

interface MyWifi1{
    String [] getNetworks();
    void connectToNetwork(String x);
}
class MyCellPhone1{
    void callNumber(long phno){
        System.out.println("Calling " + phno);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }

}
class MySmartPhone1 extends MyCellPhone implements MyWifi1,MyCamera1{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording...");
    }
    public  String [] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networklist = {"Gowtham","nikhil","harry"};
        return networklist;
    }

    @Override
    public void connectToNetwork(String networks) {
        System.out.println("Conecting.. to :"+networks );
    }

}
public class PolymorphismInInterfaces {
    public static void main(String[] args) {
        MyCamera1 mcm = new MySmartPhone1();// --> This is smart phone use it as a camera
        mcm.record4KVedio();
        mcm.takeSnap();
        /*
        we are only allowed to use the methords in Mycamera1 interface
         mcm.getNetworks();--> not allowed */
    }
}
