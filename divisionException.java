//wap to divide two no in exception handling

class Print extends Thread{
    public void div(){
        try{
            System.out.println(12/4);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
public class divisionException{
    public static void main(String[] args) {
        Print p1 = new Print();
        p1.div();
    }
}
