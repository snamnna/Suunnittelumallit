package facade;

class ComputerFacade {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    public void start() {
        cpu.freeze();
        char[] bootData = hardDrive.read(0, 50);
        memory.load(0, bootData); // Load char[] data into memory at position 0
        cpu.jump(0);
        cpu.execute();
    }
}
