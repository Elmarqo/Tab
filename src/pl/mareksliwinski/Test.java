package pl.mareksliwinski;

public class Test {

    public static void main(String[] args) {
        Tab go = new Tab();
        go.setup();
        go.fillOut(go.tab, go.max);
        go.sort();
        go.desSort();
    }
}
