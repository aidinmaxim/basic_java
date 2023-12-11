package lessons.lesson_49.hashMap;
/*
@date 14.11.2023
@author Sergey Bugaienko
*/

public class HashMapApp {
    public static void main(String[] args) {
        lessons.lesson_49.hashMap.MyHashMap<Integer, String> map = new lessons.lesson_49.hashMap.MyHashMap<>();

        System.out.println("value: " + map.put(5, "Str"));
        System.out.println("=========================");
        System.out.println("value: " + map.put(21, "Python"));
        System.out.println(map + " size: " + map.size());
        System.out.println("value: " + map.put(21, "Java"));

        System.out.println(map + " size: " + map.size());

        System.out.println(map.put(null, "test"));
        System.out.println(map + " size: " + map.size());
        System.out.println(map.put(null, "orange"));
        map.put(0, "zero");
        System.out.println(map + " size: " + map.size());
        map.put(16, "Apple");
        map.put(17, "Asus");
        System.out.println(map + " size: " + map.size());

        System.out.printf("21: " + map.get(21));
        System.out.printf("16: " + map.get(16));
        System.out.printf("null: " + map.get(null));
        System.out.println("0: " + map.get(0));

        System.out.printf(map + " size: " + map.size());
        map.put(37, "Banana");
        map.put(9, "Cat");
        map.put(11, "Robot");
        map.put(43, "Map");
        map.put(25, "Tree");
        System.out.printf(map + " size: " + map.size());
        map.put(8, "Red");
        System.out.printf(map + " size: " + map.size());

        System.out.printf("21: " + map.get(21) + "\n");
        System.out.printf("16: " + map.get(16) + "\n");
        System.out.printf("null: " + map.get(null) + "\n");
        System.out.println("0: " + map.get(0) + "\n");
    }
}
