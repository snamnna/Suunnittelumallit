package facade;

class HardDrive {
    public char[] read(long lba, int size) {
        // Simulate reading data from the hard drive, here using dummy characters for
        // demonstration
        char[] data = new char[size];
        for (int i = 0; i < size; i++) {
            data[i] = (char) ('A' + i); // Dummy data for demonstration purposes
        }
        System.out.println("Reading from Hard Drive at LBA " + lba + " with size " + size);
        return data;
    }
}