package src;
class Demo{
    private int a,b,Add,mul;
    int getAdd(){
      return mul; 
    }
    void setAdd(int a,int b,int c){
     Add= a + b; 
     mul =c*Add; 
    }
}

public class Encapsulation_exa{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.setAdd(8,7,4);
        System.out.println(d.getAdd());  
    }
}
