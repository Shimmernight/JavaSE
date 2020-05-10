package netWork.Talk;

public class Student {
    public static void main(String[] args) {
        System.out.println("------------咨询课程------------");
        new Thread(new TalkSender("localhost",5555,7777)).start();
        new Thread(new TalkReceiver(8888,"老师：")).start();
    }
}
