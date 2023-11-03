package proxy;

import java.util.ArrayList;
import java.util.List;

class ProxyExample {
    /**
     * Test method
     */
    public static void main(final String[] arguments) {

        List<Image> photoAlbum = new ArrayList<>();
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo1"));
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo2"));
        photoAlbum.add(new ProxyImage("Picture 3"));
        photoAlbum.add(new ProxyImage("Picture 4"));

        // Näytetään kansion sisältö, muttei ladata itse kuvia
        System.out.println("Content in the photoalbum:");
        for (Image image : photoAlbum) {
            image.showData();
        }

        // Ladataan itse kuvat tarvittaessa
        for (Image image : photoAlbum) {
            System.out.println("Browsing " + image.getFilename());
            image.displayImage();
        }
    }
}