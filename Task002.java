import java.util.HashMap;
import java.util.Map;

public class Task002 {
    public static void main(String[] args) {
        String worker = "Жданов Иванов Петров Иванов Петров Петров Сидоров Иванов";
        String[] ar = worker.split(" ");
        HashMap<String, Integer> sortWorker = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            int count = 0;

            for (int j = 0; j < ar.length; j++) {
                if (ar[i].equals(ar[j])) {
                    count++;
                }
            }

            sortWorker.put(ar[i], count);
        }

        sortWorker.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }
}