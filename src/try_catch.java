class Test extends Thread{
    public void exam(){
         try{
            for(int i = 0; i <= 6; i++){
                System.out.println("hey, how are you");
                Thread.sleep(0);
            }
        }catch(InterruptedException i){
            System.out.println(i);
        }
    }
}
public class try_catch {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.exam();
    }
}