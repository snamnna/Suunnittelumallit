package facade;

class ComputerFacade {
    private static final long kBootAddress = 0; // Define boot address
    private static final long kBootSector = 0; // Define boot sector
    private static final int kSectorSize = 64; // Define sector size

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory(68); // Define memory size
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("Booting process initiated...");
        cpu.freeze();
        System.out.println("CPU is frozen.");

        char[] bootData = hardDrive.read(kBootSector, kSectorSize);
        System.out.println("Data read from hard drive.");

        memory.load(kBootAddress, bootData);
        System.out.println("Data loaded into memory.");

        System.out.println("\nData loaded into memory:");
        char[] loadedData = memory.getData();
        for (int i = 0; i < loadedData.length; i++) {
            System.out.println("Memory address " + i + ": " + loadedData[i]);
        }

        cpu.jump(kBootAddress);
        System.out.println("CPU jumped to boot address.");

        cpu.execute();
        System.out.println("Boot process completed.");
    }

}