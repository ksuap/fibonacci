public class Fibonacci{
    public void run(String[] args) {
        int max = parseMax(args);
        List<Integer> list = fibonacciList(max);
        printList(list);
    }
}
