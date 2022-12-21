import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        String worker;
        ArrayList<String> suname = new ArrayList<>();
        HashMap<String, Integer> sortWorker = new HashMap<>();
        System.out.println("Введите ФИО сотрудника. Чтобы закончить набери end!");
        do {
            Scanner in = new Scanner(System.in);
            worker = in.next();
            String[] ar = worker.split(" ");
            suname.add(ar[0]);
        } while (!worker.equals("end"));

        for (int i = 0; i < suname.size() - 1; i++) {
            int count = 0;

            for (int j = 0; j < suname.size() - 1; j++) {
                if (suname.get(i).equals(suname.get(j))) {
                    count++;
                }
            }

            sortWorker.put(suname.get(i), count);
        }

        sortWorker.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }
}