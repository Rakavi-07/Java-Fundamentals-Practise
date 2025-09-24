class Hello extends Thread{
    public void run(){
        for(int i=1 ; i<=5 ; i++){
             System.out.println("Hello!");

        }
       
    }
}
class Welcome extends Thread{
    public void run(){
        for(int i=1 ; i<=5 ; i++){
             System.out.println("Welcome!!");

        }
       
    }
}
public class Greetings{
    public static void main(String[] args){
        Hello g1 = new  Hello();
        Welcome g2 = new Welcome();
        g1.start();
        g2.start();
    }
}