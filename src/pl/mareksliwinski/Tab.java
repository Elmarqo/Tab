package pl.mareksliwinski;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Math.*;
import static java.util.Collections.*;

public class Tab {

    Integer max;
    Integer tab[];

    public void setup() {
        String text = ("Ala ma wielkiego");
        max = text.length() + 1;
        tab = new Integer[max];
    }

    public void fillOut(Integer[] tab, Integer max) {
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





