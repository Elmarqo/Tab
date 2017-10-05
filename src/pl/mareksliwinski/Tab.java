package pl.mareksliwinski;
import java.util.Arrays;
import java.util.Collections;

public class Tab {

    int max;
    Integer tab[];

    public void setup() {
        String text = ("Ala ma wielkiego");
        max = text.length();
        tab = new Integer[max];
    }

    public void fillOut(Integer[] tab, int max) {
        for (int i = 0; i < max; i++) {
            tab[i] = (int) (Math.random() * 100);
            System.out.println(tab[i]);
        }
    }

    public void sort() {
        System.out.println("=================================");
        Arrays.sort(tab);
        for (int i = 0; i < max; i++) {
            System.out.println(tab[i]);
        }
    }

    public void desSort(){
        System.out.println("=================================");
        Arrays.sort(tab, Collections.reverseOrder());
        for (int i = 0; i < max; i++) {
            System.out.println(tab[i]);
            }
        }
    }





