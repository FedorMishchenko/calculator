public class Application {
    private Calculator calculator;

    public void init() {
        calculator = new Calculator();
    }

    public void run() {
        while (true){
            init();
            calculator.display();
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }
}
