package NemezisNauka.Kolekcje;

import java.util.PriorityQueue;

public class Kolejka {
    public static void wyswietl(){
        PriorityQueue<Integer> x = new PriorityQueue<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        System.out.println(x.size());
        System.out.println(x.peek());
        System.out.println(x.poll());
        x.remove();
        System.out.println(x.poll());
        System.out.println(x.poll());
        System.out.println(x.poll());
        System.out.println(x.isEmpty());
    }
}
