package NemezisNauka.Kolekcje;

import java.util.ArrayDeque;
import java.util.Deque;

public class KolejkaPlusStos {
    public static void wyswietl(){
        ArrayDeque<Integer> x = new ArrayDeque<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        x.add(6);
        System.out.println(x);
        System.out.println(x.getFirst());
        System.out.println(x.getLast());
        System.out.println(x.peek());
        System.out.println(x);
        System.out.println(x.size());
        System.out.println(x.poll());
        System.out.println(x);
        System.out.println();

        Deque<Integer> y = new ArrayDeque<>();
        y.push(10);
        y.push(11);
        y.push(12);
        y.push(13);
        System.out.println(y);
        System.out.println(y.getFirst());
        System.out.println(y.getLast());
        System.out.println(y.peek());
        System.out.println(y);
        System.out.println(y.size());
        System.out.println(y.pop());
        System.out.println(y);
    }
}
