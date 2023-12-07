package facade;

class HardDrive {
    public char[] read(long lba, int size) {
        String dataToLoad = "Hello, World!";
        return dataToLoad.toCharArray();
    }
}