package lessons.lesson_31;

/**
 * 18.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class MyLinkedList<T> implements MyList<T>, Queue<T>{

    private int size;
    private Node<T> first;
    private Node<T> last;

    public void add(T value) {
        if (first == null) {
            first = new Node<>(value, null, null);
        } else if (last == null) {
            last = new Node<>(value, first, null);
            first.next = last;
        } else {
            Node<T> temp = last;
            System.out.println(temp.previous);
            System.out.println(first.next);
            last = new Node<>(value, temp,null);
            temp.next = last;
        }

        size++;
    }

    @Override
    public void addAll(T... values) {
        for (T value: values) {
            add(value);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(T value) {
        int index = 0;
        Node<T> cursor = first;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return index;
            }
            index++;
            cursor = cursor.next;
        }

        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        if (size == 0) return -1;

        if (size == 1) {
            if (first.equals(value)) return 0;
        }

        int index = size - 1;
        Node<T> cursor = last;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return index;
            }
            index--;
            cursor = cursor.previous;
        }

        return -1;
    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public boolean remove(T value) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (first != null) {
            sb.append(first.value);
            Node<T> cursor = first.next;
            while (cursor != null) {
                sb.append((", "));
                sb.append(cursor.value);
                cursor = cursor.next;
            }
        }

        sb.append("]");

        return sb.toString();
    }

    @Override
    public void addLast(T value) {
        add(value);
    }

    @Override
    public void addFirst(T value) {
        if (first == null) {
            first = new Node<>(value, null, null);
            size++;
            return;
        } else if (last == null) {
            last = first;
            first = new Node<>(value, null, last);
            last.previous = first;
        } else {
            Node<T> temp = first;
            first = new Node<>(value, null, last);
            last.previous = temp;
        }

        size++;
    }

    @Override
    public T getFirst() {
        return (first == null ? null : first.value);
    }

    @Override
    public T getLast() {
        return (last == null ? null : last.value);
    }

    // удалить первый узел
    @Override
    public T remove() {
        if (size == 0) return null;

        T value = first.value;
        if (size == 1) {
            first = null;
        } else if (size == 2) {
            first = last;
            first.previous = null;
            last = null;
        } else {
            first = first.next;
            first.previous = null;
        }

        size--;
        return value;
    }

    @Override
    public T removeFirst() {
        return remove();
    }

    @Override
    public T removeLast() {
        if (size == 0) return null;

        T value;
        if (size == 1) {
            value = first.value;
            first = null;
        } else if (size == 2) {
            value = last.value;
            first = null;
        } else {
                value = last.value;
                last = last.previous;
                last.next = null;
            }

            size--;
            return value;
    }

    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;

        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + (value != null ? value : "null") +
                    ", previous=" + (previous != null ? previous.value : "null") +
                    ", next=" + (next != null ? next.value : "null") +
                    '}';
        }


    }
}