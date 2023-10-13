package Strategy;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list = List.of("H", "A", "L", "S", "E", "Y");

        ListConverter iteratorStrategy = new IteratorStrategy();
        ListConverter forLoopStrategy = new ForLoopStrategy();
        ListConverter getMethodStrategy = new GetMethodStrategy();

        System.out.println("Iterator Strategy:");
        System.out.println(iteratorStrategy.listToString(list));

        System.out.println("\nFor Loop Strategy:");
        System.out.println(forLoopStrategy.listToString(list));

        System.out.println("\nGet Method Strategy:");
        System.out.println(getMethodStrategy.listToString(list));
    }
}
