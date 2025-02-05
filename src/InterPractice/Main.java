package InterPractice;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Check check=new Check();
        check.hello();
        check.yo();
        A.hi();

    }
}

interface A{
    void hello();
    default void yo(){
        System.out.println("yo");
    }
    static void hi(){
        System.out.println("hi");
    }


}
class Check implements A{


    @Override
    public void hello() {
        System.out.println("hello");
    }

}