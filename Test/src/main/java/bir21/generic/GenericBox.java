package bir21.generic;
// nenustatytas tipas
// <T> nurodo vartotojas, koki tipa naudos
// naudojama palyginimui
public class GenericBox<T> {
    private T item;

//    public GenericBox(T item, Class<T> clazz) {

    public GenericBox(T item) {
        if (item instanceof Integer) {
            // patikrina pagal tipa
        }
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
