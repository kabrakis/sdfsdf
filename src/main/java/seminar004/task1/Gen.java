package seminar004.task1;

public class Gen<T, V> {
    private T ob; // объявить объект типа T
    private V ob2; // объявить объект типа V


    public Gen(T ob, V ob2) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public V getOb2() {
        return ob2;
    }

    void showType() {
        System.out.println("Тип Т это " + ob.getClass().getName());
        System.out.println("Тип V это " + ob2.getClass().getName());
    }
}
