class MyThread extends Thread {
    
    public void run(){
        System.out.println("Print numbers");
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }
    }
}
public class PrintNumbers{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();
    }
}