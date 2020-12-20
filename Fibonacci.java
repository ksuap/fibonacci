public class Fibonacci{
    public void run(String[] args) {
        int max = parseMax(args);
        List<String> list = fibonacciList(max);
        printList(list);
    }
}
