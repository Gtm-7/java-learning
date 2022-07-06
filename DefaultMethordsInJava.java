package com.red_sandel;

interface MyCamera{
    void takeSnap();
    void recordVideo();
   default void record4KVedio(){
       System.out.println("recording in 4k ");
    }
}

interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String x);
}
class MyCellPhone{
    void callNumber(int phno){
        System.out.println("Calling " + phno);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }

}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
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
public class DefaultMethordsInJava {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String [] ar = ms.getNetworks();
        for (String item:ar) {
            System.out.println(item);
        }

    }
}
