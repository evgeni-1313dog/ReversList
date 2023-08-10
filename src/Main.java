import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Product> linkedList = new LinkedList<>();
        linkedList.addFirst(new Product("AAA",865));
        linkedList.addFirst(new Product("BBB",633));
        linkedList.addFirst(new Product("CCC",963));
        linkedList.addFirst(new Product("DDD",8653));
        linkedList.addFirst(new Product("EEE",454));
        linkedList.addFirst(new Product("FFF",6546));

        for (Product product:linkedList) {
            System.out.println(product);
        }



        System.out.println("-----------------------------");

        linkedList.Revers();
        for (Product product:linkedList) {
            System.out.println(product);
        }
    }
}