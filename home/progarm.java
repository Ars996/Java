package home;

import java.util.ArrayList;

public class progarm {

    // 1 Выбросить случайное целое число и сохранить в i
public static int Random(String[] args) {
    int i = new home.Random().nextInt('k');
    System.out.println(i);
    return i; 
   
 
}//2 Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
public static int seniorBit(int i) {
    int binLen = Integer.toBinaryString(i).length();
    return binLen;
    
}//3 Найти все кратные n числа большие i и сохранить в массив m1
public static ArrayList<Integer> arrayMult(int i, int n, int max) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int j = i + 1; j <= max; j++) {
        if (j % n == 0) {
            list.add(j);
        }
    }
    return list;
}

// 4 Найти все некратные n числа меньшие i и сохранить в массив m2
public static ArrayList<Integer> arrayNotMult(int i, int n, int min) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int j = i - 1; j >= min; j--) {
        if (j % n != 0) {
            list.add(j);
        }
    }
    return list;
}

}