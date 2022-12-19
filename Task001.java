import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        Task task = new Task();
        Map<Integer, String> telefon = task.fillMap(new HashMap<>());
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию");
        task.getTelefonInfoByName(telefon, in.next());
        in.close();

    }
}

class Task {

    public Map<Integer, String> fillMap(Map<Integer, String> telefon) {
        telefon.put(511893050, "Ivanova");
        telefon.put(368018, "Ivanova");
        telefon.put(42684585, "Petrova");
        telefon.put(8364585, "Petrova");
        telefon.put(36458574, "Ivanov");
        telefon.put(364596, "Ivanov");
        telefon.put(964585, "Ivanov");

        return telefon;
    }

    public void getTelefonInfoByName(Map<Integer, String> telefon, String name) {
        for (Map.Entry<Integer, String> telefonEntry : telefon.entrySet()) {
            if (telefonEntry.getValue().equals(name)) {
                System.out.println(telefonEntry.getKey());

            }
        }

    }
}