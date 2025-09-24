class TableThread extends Thread{
    public int num;
    public TableThread(int num){
        this.num=num;
    }
    public void run(){
        System.out.println("Table of Multiplication");
        for(int i=1; i<=10; i++){
            System.out.println(num +"X"+ i +"=" +(num*i));
        }

    }

}
public class Tables{
    public static void main(String[] args){
        TableThread t1 = new TableThread(5);
       
        TableThread t2 = new TableThread(10);
        t1.start();
        t2.start();
    }
}