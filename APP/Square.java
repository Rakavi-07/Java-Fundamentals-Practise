class SquarePrint implements Runnable{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Square of "+ i + " is " + (i*i));
        }
    }
}
public class Square{
    public static void main(String[] args){
        SquarePrint s1 = new SquarePrint();
        Thread t1 = new Thread(s1);
        t1.start();
    }
}