package facade;

class Memory {
    public void load(long position, char[] data) {
        System.out.println("Loading data into memory at position " + position + ":");
        for (char datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }
}
