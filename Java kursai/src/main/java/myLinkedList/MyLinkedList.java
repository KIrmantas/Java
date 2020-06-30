package myLinkedList;

//    LinkedList

public class MyLinkedList {
    private Elements first;
    private int size;

    private static class Elements {
        String value;
        Elements next;

        public Elements(String value, Elements next) {
            this.value = value;
            this.next = next;
        }
    }

    private void addElement(String value, Elements current) {
        if (current == first) {
            first = new Elements(value, current);
        } else {
            current.next = new Elements(value, current.next);
        }
    }

    private Elements getLastLink() {

        if (this.first == null) {
            return null;
        }
        Elements last = this.first;
        while (last.next != null) {
            last = last.next;
        }
        return last;
    }

    private Elements getBefore(int index) {
        Elements before = null;
        Elements current = first;
        for (int i = 0; i < index; i++) {
            before = current;
            current = current.next;
        }
        return before;
    }


    public MyLinkedList(String... values) {

        if (values.length == 0) {
            size = 0;
            first = null;
        } else {
            for (String v : values) {
                add(v);
            }
        }
    }

    public int size() {
        return size;
    }

    public void add(String value) {
        Elements last = getLastLink();
        if (last == null) {
            first = new Elements(value, null);
        } else {
            last.next = new Elements(value, null);
        }
        size++;
    }

    public void add(int index, String value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Elements before = getBefore(index);
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
            Elements before = getBefore(index);
            before.next = before.next.next;
        }
        size--;
        return true;
    }

    public boolean remove(String value) {
        if (first.value.equals(value)) {
            first = first.next;
            size--;
            return true;
        } else {
            Elements before = first;
            for (Elements current = first.next; current != null; current = current.next) {
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

    public int indexOf(String value) {
        Elements temp = this.first;
        for (int i = 0; i < size; i++) {
            if (temp.value.equals(value)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean contains(String value) {
        return indexOf(value) > -1;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Elements current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void set(int index, String newValue) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Elements current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = newValue;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        Elements elem = this.first;
        while (elem != null) {
            str.append(elem.value);
            elem = elem.next;
            str.append(elem == null ? "" : ", ");
        }
        str.append("]");
        return str.toString();
    }

}
