package MyLinkedListGeneric;

//    LinkedList

public class MyLinkedListGeneric<T> {
    private Elements<T> first;
    private int size;

    private static class Elements<T> {
        T value;
        Elements<T> next;

        public Elements(T value, Elements<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    private void addElement(T value, Elements<T> current) {
        if (current == first) {
            first = new Elements<>(value, current);
        } else {
            current.next = new Elements<>(value, current.next);
        }
    }

    private Elements<T> getLastLink() {

        if (this.first == null) {
            return null;
        }
        Elements<T> last = this.first;
        while (last.next != null) {
            last = last.next;
        }
        return last;
    }

    private Elements<T> getBefore(int index) {
        Elements<T> before = null;
        Elements<T> current = first;
        for (int i = 0; i < index; i++) {
            before = current;
            current = current.next;
        }
        return before;
    }


    @SafeVarargs
    public MyLinkedListGeneric(T... values) {

        if (values.length == 0) {
            size = 0;
            first = null;
        } else {
            for (T v : values) {
                add(v);
            }
        }
    }

    public int size() {
        return size;
    }

    public void add(T value) {
        Elements<T> last = getLastLink();
        if (last == null) {
            first = new Elements<>(value, null);
        } else {
            last.next = new Elements<>(value, null);
        }
        size++;
    }

    public void add(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Elements<T> before = getBefore(index);
        if (before == null) {
            addElement(value, first); // = new Elements(value, this.first);
        } else {
            addElement(value, before); // = new Elements(value, before.next);
        }
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = first.next;
        } else {
            Elements<T> before = getBefore(index);
            before.next = before.next.next;
        }
        size--;
        return true;
    }

    public boolean remove(T value) {
        if (first.value.equals(value)) {
            first = first.next;
            size--;
            return true;
        } else {
            Elements<T> before = first;
            for (Elements<T> current = first.next; current != null; current = current.next) {
                if (current.value.equals(value)) {
                    before.next = current.next;
                    size--;
                    return true;
                }
                before = current;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        first = null;
        size = 0;
    }

    public int indexOf(T value) {
        Elements<T> temp = this.first;
        for (int i = 0; i < size; i++) {
            if (temp.value.equals(value)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) > -1;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Elements<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void set(int index, T newValue) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Elements<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = newValue;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        Elements<T> elem = this.first;
        while (elem != null) {
            str.append(elem.value);
            elem = elem.next;
            str.append(elem == null ? "" : ", ");
        }
        str.append("]");
        return str.toString();
    }

}
