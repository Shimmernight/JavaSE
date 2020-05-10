package netWork.Talk;

public class Teacher {
    public static void main(String[] args) {
        new Thread(new TalkSender("127.0.0.1",6666,8888)).start();
        new Thread(new TalkReceiver(7777,"学生：")).start();
    }
}
