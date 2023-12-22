import java.util.ArrayList;
import java.util.List;

public class Threads extends Thread{


    List<Integer> allNumber=new ArrayList<>();
    List<Integer>evenNumber=new ArrayList<>();
    List<Integer>oddNumber=new ArrayList<>();
    public Threads(List<Integer> allNumber, List<Integer> evenNumber, List<Integer> oddNumber) {
        this.allNumber = allNumber;
        this.evenNumber = evenNumber;
        this.oddNumber = oddNumber;
    }

    @Override
    public void run() {
        for (int number : allNumber) {
            if (number % 2 == 0) {
                synchronized (evenNumber) {
                    evenNumber.add(number);
                }
            } else {
                synchronized (oddNumber) {
                    oddNumber.add(number);
                }
            }
        }





    }


}
