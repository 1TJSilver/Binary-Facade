public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println("In binary 15 * 5 = " + binOps.mult("1111", "0101"));
        System.out.println("In binary 77 + 33 = " + binOps.sum("1001101", "00100001"));
    }
}
