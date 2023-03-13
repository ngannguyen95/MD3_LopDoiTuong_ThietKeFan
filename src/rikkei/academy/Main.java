package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        XayDungLopFan fan1=new XayDungLopFan();
        fan1.setOn(true);
        fan1.setFanSpeed(XayDungLopFan.FAST);
        fan1.setColor("Yellow");
        fan1.setFanRadius(10);
        XayDungLopFan fan2=new XayDungLopFan();
        fan2.setFanSpeed(XayDungLopFan.MEDIUM);
        fan2.setFanRadius(5);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}