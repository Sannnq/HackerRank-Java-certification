class SampleDemo implements Runnable{
    private Thread t;
    private String s;
    SampleDemo (String s){
        this.s=s;
    }
    public void run(){
        while(true){
            System.out.println(s);
        }
    }
    public void start(){
        if(t==null)
        {
        t=new Thread(this,s);
            t.start(); 
        }
    }

}
public class one{

    public static void main(String[] args) {
        SampleDemo A=new SampleDemo("A");
        SampleDemo B=new SampleDemo("B");
        B.start();
        A.start();
    }
}