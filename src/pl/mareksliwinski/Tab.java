package pl.mareksliwinski;
import java.util.Arrays;
import static java.util.Comparator.reverseOrder;

public class Tab {

public void setup()
{
    String text = ("Ala ma wielkiego kota");
    int max = text.length() + 1;
    int[] tab = new int[max];
    System.out.println(tab.length);
}

    public void fillOut(int[] tab, int max) {

        for (int i = max; i > 0; i--) {
            tab[i] = i * i;
        }
    }


    /*public void sort(){
        Arrays.sort(tab);
        for(int i = 0; i < max; i++){
            System.out.println(tab[i]);
        }*/
        //Arrays.sort(tab, reverseOrder());
        //for(int i = 0; i < max; i++){
          //  System.out.println(tab[i]);
}




