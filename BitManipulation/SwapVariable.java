package BitManipulation;

public class SwapVariable {
    public static void swap(int a,int b){

        System.out.println(a+"  "+b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a+"  "+b);
    }

}
