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
public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}