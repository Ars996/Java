// Разработать программу, имитирующую поведение коллекции HashSet. 
// В программе содать метод add добавляющий элемент, и метод позволяющий выводить эллементы коллекции в консоль. 
// Формат данных Integer.

import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();
        set.add(11);
        set.add(22);
        set.add(33);
        set.add(44);
        set.add(55);
        //set.add(22);
 
        System.out.println("HashSet : " + set);
              
    }  
}
    