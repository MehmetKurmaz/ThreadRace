import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer>allNumber=new ArrayList<>();
        for (int i=0;i<10000;i++){
            allNumber.add(i);
        }
        List<Integer>evenNumber=new ArrayList<>();
        List<Integer>oddNumber=new ArrayList<>();
        List<Threads>list=new ArrayList<>();
        for (int i=1;i<4;i++){
            List<Integer> subList = allNumber.subList(i * 2500, (i + 1) * 2500);
            Threads threads=new Threads(subList,evenNumber,oddNumber);
            list.add(threads);
            threads.run();
        }
        for (Threads thread : list) {
           thread.join();
        }

        System.out.println("Çift Sayılar : " + evenNumber.size());
        System.out.println("Tek Sayılar : " + oddNumber.size());

    }
}