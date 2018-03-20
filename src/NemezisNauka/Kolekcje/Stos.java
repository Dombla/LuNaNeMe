package NemezisNauka.Kolekcje;

import java.util.Stack;

public class Stos {
    public static void wyswietl(){
        Stack<Integer> x = new Stack<>();
        x.push(1);
        x.push(2);
        x.push(3);
        x.push(4);
        x.push(5);
        System.out.println(x.empty());
        System.out.println(x.peek());
        System.out.println("pozycja: " + x.search(2));
        System.out.println(x.pop());
        x.pop();
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.empty());
    }
}
