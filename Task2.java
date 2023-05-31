import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("V");
        list.add("L");
        list.add("A");
        list.add("D");
        System.out.println(list);
        enqueue(list, "X");
        System.out.println(list);
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println(first(list));
        System.out.println(list);
    }

    public static void enqueue(LinkedList<String> list, String str) {
        list.addLast(str);
    }

    public static String dequeue(LinkedList<String> list) {
        return list.pollFirst();
    }

    public static String first(LinkedList<String> list) {
        return list.getFirst();
    }

}
