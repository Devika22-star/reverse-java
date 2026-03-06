public class SameClassStatic {
    public static void main(String args[])
    {   
      test.sub();
    }
    public class test{
        public static void sub(){
            int a=100;
            int b=50;
            System.out.println(a-b);
        }
    }
}
