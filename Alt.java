class Alt{
    Alt(int a,int b){
    System.out.println(a+b);
    }

    public void run(){
     System.out.println("i can run");
    }
    public static void main(String[] args) {
        Alt t1=new Alt(4,6);
        Alt t2=new Alt(4,5);
        t1.run();
        t2.run();
    }
}
