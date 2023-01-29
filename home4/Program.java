package home4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ForkJoinPool;

import javax.xml.transform.Templates;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> name = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();
    }

    String str = "";try
    {

        FileReader reader = new FileReader("bd.sql");
        while (reader.ready()) {
            str += (char) reader.read();
        }
    }

    catsh (IOException e){
        throw new RuntimeException(e);
    }

    String[] strings = str.split ("\r\n");for(
    int i = 0;i<strings.length;i++){
        String[] tmp = strings[i].split("", );
        family.add(tmp[0]);
        name.add(tmp[1]);
        soname.add(tmp[2]);
        age.add(Integer.parseInt(tmp[3]));
        gender.add(tmp[4].equals("Ж")?true:false);
        index.add(i);
    }
    ArrayList<String> tmp = new ArrayList<>(family);Collections.sort(tmp);
    for(int i = 0;i<tmp.size();i++)    {
        int j = family.indexOf(tmp.get(i));
        index.set(i, j);
    }
    for( int i = 0; i < index.size(); i++)
    {
        System.out.print(family.get(index.get(i)) + " ");
    }
  }
}