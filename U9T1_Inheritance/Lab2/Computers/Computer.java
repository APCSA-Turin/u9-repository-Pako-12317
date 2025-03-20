package Computers;

public class Computer {
    private int screenSize;
    private int memory;

    public Computer(int screenSize, int memory) {
        this.screenSize = screenSize;
        this.memory = memory;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getMemory() {
        return memory;
    }

    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }

    public void printInfo() {
        System.out.println("Screen size: " + screenSize + " inches");
        System.out.println("Memory: " + memory + " GB");
    }
}
