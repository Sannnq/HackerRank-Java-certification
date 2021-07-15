/*Return a compiation Error due to non-static method() referenced on a static context */


interface BaseI {void method();}
class BaseC
{
    public void method(){
        System.out.println("Inside BaseC::method");
    }
}

class Implc extends BaseC implements BaseI
{
     public static void main(String[]s) 
     {
        (new Implc()).method();
    }
}
