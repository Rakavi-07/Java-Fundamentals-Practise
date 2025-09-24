 class Oddthread extends Thread{
    public void run(){
        System.out.println("Odd numbers");
        for(int i = 1; i<=10; i+=2)   {
            System.out.println(i);
        } 
    }
}
class EvenThread extends Thread{
    public void run(){
        System.out.println("Even numbers");
        for(int i = 2; i<=10; i+=2)   {
            System.out.println(i);
        } 
    }
}
public class OddEvenNumber{
    public static void main(String[] args) {
        Oddthread o1= new Oddthread();
        EvenThread e1 = new EvenThread();
        o1.start();
        e1.start();

        
    }
}