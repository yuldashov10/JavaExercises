package hackerrank.oop;

class Arithmetic {
    int add(int x, int y) {
        return x + y;
    }
}


class Adder extends Arithmetic {

}


public class InheritanceTask2 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.printf(
                "My superclass is: %s\n%d %d %d\n",
                adder.getClass().getSuperclass().getSimpleName(),
                adder.add(21, 21),
                adder.add(6, 7),
                adder.add(10, 10));
    }
}
