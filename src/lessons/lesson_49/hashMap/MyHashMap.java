package lessons.lesson_49.hashMap;
/*
@date 14.11.2023
@author Sergey Bugaienko
*/

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MyHashMap<K, V> implements InterfaceHashMap<K, V> {

    private Node<K, V>[] buckets;
    private int capacity = 16;
    private double loadFactor = 0.75;
    private int size;

    public MyHashMap() {
        this.buckets = (Node<K, V>[]) new Node[capacity];
    }

    /*
    1. Вычислить хэш-код ключа.
    2. На основание кэша определить индекс корзины в массиве.
    3. Если в корзине еще нет элементов - положить новую пару ключ-значение
    4. Если в корзине есть элементы: пройти по цепочке элементов, проверить ключи на совпадение.
    4.1. Если ключи совпадают - обновить значение для соответствующего ключа
    4.2. Если не найдено совпадений ключей - приклеить новую пару в конец списка
     */
    @Override
    public V put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];

        //проверяем наличие цепочки нод и сверяем ключи (п.4 + п4.1)
        while (current != null) {

            //обрабатываем ситуацию key = null
            if (current.key == null && key == null) {
                current.value = value;
                return value;
            }

            //сверяем ключи
            if (current.key != null && current.key.equals(key)) {
                current.value = value;
                return value;
            }

            // надо зафиксировать последнюю ноду в цепочке
            if (current.next == null) {
                break;
            }

            current = current.next;
        }


        System.out.println("current after while: " + current);

        // создаю новую пару ключ значение
        Node<K, V> newNode = new Node<>(key, value);

        // проверка наличия цепочки в ячейке (п.3 план)
        if (current == null) {
            // значит под индексом пустая ячейка
            buckets[index] = newNode;
        } else {
            //в ячейке была как минимум 1 нода. Надо приклеить новую ноду в конец цепочки (п.4.2)
            current.next = newNode;
        }

        size++;



        if (1.0 *size / capacity >= loadFactor) {
            resize();
        }
        return value;
    }

    private void resize() {
        System.out.printf("Перерасчет карты");

        capacity = capacity * 2;
        Node<K, V>[] newBackets = (Node<K, V>[]) new Node[capacity];

        for (Node<K, V> node : buckets) {
            Node<K, V> current = node;

            while (current != null) {
                Node<K, V> next = current.next;

                int newIndex = getIndex(current.key);
                current.next = newBackets[newIndex];
                newBackets[newIndex] = current;

                current = next;
            }

        }
        System.out.printf("resize finished");

        buckets = newBackets;
    }

    @Override
    public V get(Object key) {
        int index = key != null ? key.hashCode() & (capacity - 1) : 0;
        Node<K, V> current = buckets[index];

        while (current != null) {
            if (current.key == null && key == null) {
                return current.value;
            }

            if (current.key != null && current.key.equals(key)) {
                return current.value;
            } else {
                current = current.next;
            }
        }

        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Node<K, V> node : buckets) {
            if (node != null) {
                sb.append(node.getList());
            }
        }

        return sb.append("]").toString();
    }

    private int getIndex(K key) {
        //проверка ключа на null
        if (key == null) return 0;


//        int hashCode = key.hashCode();
//        int index = Math.abs(hashCode) % capacity;
        // capacity ДОЛЖНО быть степенью двойки
        int index = key.hashCode() & (capacity - 1);
        System.out.println("index: " + index);
        return index;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        return null;
    }

    private static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" +
                    key +
                    ": " + value +
                    '}';
        }

        public String getList() {
            Node<K, V> cursor = this;
            StringBuilder sb = new StringBuilder("[");
            while (cursor != null) {
                sb.append(cursor);
                sb.append(", ");
                cursor = cursor.next;
            }

            sb.setLength(sb.length() - 2);
            return sb.append("]").toString();

        }
    }

}
