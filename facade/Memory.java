package facade;

class Memory {
    private char[] data;

    public Memory(int size) {
        this.data = new char[size];
    }

    public void load(long position, char[] data) {
        System.out.println("Memory: Loading data to address " + position);
        System.arraycopy(data, 0, this.data, (int) position, data.length);
    }

    public char[] getData() {
        return data;
    }
}