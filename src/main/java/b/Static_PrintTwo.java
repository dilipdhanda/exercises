package b;

public class Static_PrintTwo {
        public static void main(String[] args) {
        printOne();
        printOne();
        printTwo();
    }

        public static void printOne() {
        System.out.println("Hello World");
    }

        public static void printTwo() {
        printOne();
        printOne();
    }
}
