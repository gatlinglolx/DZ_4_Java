// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("V");
        list.add("L");
        list.add("A");
        list.add("D");
        System.out.println(reverseList(list));
    }
    public static LinkedList<String> reverseList(LinkedList<String> list) {
        LinkedList<String> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}