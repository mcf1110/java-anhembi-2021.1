public class Main {
    public static void main(String[] args) {
        IntSet is = new IntSet();

        is.insert(5);
        is.insert(7);
        is.insert(1);
        is.delete(7);

        IntSet is1 = new IntSet();
        is1.insert(9);
        is1.insert(5);

        System.out.println(is.union(is1));
        System.out.println(is.union(is1).equals(is1.union(is)));
    }
}
