package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiThread {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        // Kohta a, iteroidaan kahta eri säiettä omilla iteraattoreilla
        Thread thread1 = new Thread(() -> {
            Iterator<Integer> iterator1 = list.iterator();
            while (iterator1.hasNext()) {
                System.out.println("Säie 1: " + iterator1.next());

            }
        });

        Thread thread2 = new Thread(() -> {
            Iterator<Integer> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                System.out.println("Säie 2: " + iterator2.next());
            }
        });

        System.out.println("A-kohta:");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Kohta b, käytetään kahta säiettä niin, että ne vuorottelevat samalla
        // iteraattorilla

        Iterator<Integer> iterator = list.iterator();
        Thread thread3 = new Thread(() -> {
            while (iterator.hasNext()) {
                System.out.println("Säie 3: " + iterator.next());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread4 = new Thread(() -> {
            while (iterator.hasNext()) {
                System.out.println("Säie 4: " + iterator.next());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("B-kohta:");
        thread3.start();
        thread4.start();

        // Kohta c, tehdään muutoksia kokoelaaan iteroinnin aikana
        Thread thread5 = new Thread(() -> {
            Iterator<Integer> iterator3 = list.iterator();
            while (iterator3.hasNext()) {
                Integer num = iterator3.next();
                if (num == 3) {
                    list.remove(num);
                }
            }
        });

        System.out.println("C-kohta:");
        thread5.start();

        // Odotetaan kaikkien säikeiden suoritus loppuun
        try {
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Kohta d, testataan remove metodia
        List<String> stringList = new ArrayList<>();
        stringList.add("CallOfDuty");
        stringList.add("Fortnite");
        stringList.add("Battlefield");

        System.out.println("D-kohta");
        System.out.println("Lista ennen remove metodia: " + stringList);

        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            String str = stringIterator.next();
            if (str.equals("Fortnite")) {
                stringIterator.remove();
            }
        }

        System.out.println("Lista remove metodin jälkeen: " + stringList);

        List<String> names = new ArrayList<>();
        names.add("Adele");
        names.add("Taylor");
        names.add("Halsey");

        Iterator<String> iterator4 = names.iterator();

        // Suoritetaan forEachRemaining metodi
        iterator4.forEachRemaining(name -> System.out.println("Hello, " + name));
    }
}
