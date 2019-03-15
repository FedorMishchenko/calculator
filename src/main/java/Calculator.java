import operations.*;

import java.util.HashMap;
import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, Operation<Double>> map;
    private Operation<Double> operation;

    private void init(){
        map = new HashMap<>();
        map.put("+", new Addition());
        map.put("-", new Subtraction());
        map.put("*", new Multiplication());
        map.put("/", new Division());
    }

    public Calculator(){
        init();
    }

    public void display(){
            System.out.println("Enter operation");
            String command = scanner.nextLine();
            operation = map.get(command);
            System.out.println("Enter first number");
            Double x = scanner.nextDouble();
            System.out.println("Enter second number");
            Double y = scanner.nextDouble();
            System.out.println(operation.calculate(x, y));

    }

}
