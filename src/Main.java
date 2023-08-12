// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HDFCAccount dipak = new HDFCAccount("Dipak", "Dipak123", 2000);
        System.out.println(dipak);
//        fetch bal
        System.out.println(dipak.fetchBalance("diapk123"));
    }
}