package fundamentals;


public class FunctionOne {
    public static void main(String[] args) {
        System.out.println(HelloWorld.greet());
    }
}

class HelloWorld {
    public static String greet() {
        return "hello world!";
    }
}
