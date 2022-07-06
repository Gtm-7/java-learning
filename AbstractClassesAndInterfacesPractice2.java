package com.red_sandel;
interface TvRemote{
    void changeChannel();
    void volumeControl();
    }
interface SmartTvRemote extends TvRemote{
    void voiceControl();
    void internetSettings();
}
class Television implements TvRemote{
    @Override
    public void changeChannel() {
        System.out.println("Changing channel");
    }

    @Override
    public void volumeControl() {
        System.out.println("use volume keys to control volume");
    }
    public void settings() {
        System.out.println("opening settings");
    }
}
class SmartTelevision extends Television implements SmartTvRemote{
    @Override
    public void voiceControl() {
        System.out.println("hey there speak in mike");
    }

    @Override
    public void internetSettings() {
        System.out.println("internet settings");
    }
    public void settings(){
        System.out.println("settings in smart tv");
    }
}
abstract class Telephone{
   abstract void ring();
    abstract void lift();
}
class SmartPhone1 extends Telephone{
    @Override
    void ring() {
        System.out.println("Ringing...");
    }

    @Override
    void lift() {
        System.out.println("Lifting...");
    }
    void recordVideo(int x){
        System.out.println("Recording video"+ x +" k/p");
    }
    void snapPic(){
        System.out.println("Taking Snaps..");
    }
}
public class AbstractClassesAndInterfacesPractice2 {
    public static void main(String[] args) {
        Telephone tp = new SmartPhone1();// example for poly morphisam
//        tp.lift();
        SmartPhone1 sp = new SmartPhone1();
//        sp.recordVideo(4);
//        SmartTelevision tv = new SmartTelevision();
        Television tv1 = new SmartTelevision();
        tv1.settings();
        TvRemote tv2 = new SmartTelevision();
        tv2.volumeControl();
    }
}
