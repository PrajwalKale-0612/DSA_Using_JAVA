public class First {

    int data;
    public void demo(int data)
    {
        this.data=data;
    }

    public void demo2()
    {
        this.demo(10);
        demo(90);
        demo3();
    }
   
    public static void demo3()
    {
        this.demo();
    }


    public static void main(String[] args) {
        
    }
}