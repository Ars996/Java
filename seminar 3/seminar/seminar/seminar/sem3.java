


public class void(String[] args){

    int[] ints = new int[10];

    for(int i = 0;i < ints.length; i++){
        ints[i] = new Random().nextInt (bound:100);

    }
    int[] tmp = new int[ints.length+1];
    tmp[0]=ints[0];
    tmp[1] = 123;
    for (int i =2;i< tmp.length;i++) {
        tmp[i] = ints[i-1];
    }
    ints =tmp;

    ArrayList<> = new ArrayList<>();
    for (int i= 0; i<10;i++){
        list.add(12);
    }

}
