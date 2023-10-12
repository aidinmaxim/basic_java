package homeworks.homework_25;

import homeworks.homework_25.components.Memory;
import homeworks.homework_25.components.Processor;
import homeworks.homework_25.components.Storage;

/**
 * 10.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "i7");
        Memory memory = new Memory("Corsair", "16GB DDR4");
        Storage storage = new Storage("Samsung", "500GB SSD");

        Computer computer = new Computer(processor, memory, storage);

        System.out.println("Processor Brand: " + computer.getProcessor().getBrand());
        System.out.println("Processor Model: " + computer.getProcessor().getModel());
        System.out.println("Memory Brand: " + computer.getMemory().getBrand());
        System.out.println("Memory Model: " + computer.getMemory().getModel());
        System.out.println("Storage Brand: " + computer.getStorage().getBrand());
        System.out.println("Storage Model: " + computer.getStorage().getModel());
    }
}