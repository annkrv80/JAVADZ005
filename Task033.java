import java.util.HashMap;

public class Task033 {

    public static void main(String[] args) {
        Roman roman = new Roman();
        System.out.print(roman.romanToInt("IX"));
    }

}

class Roman {

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        int arabian;
        int result = map.get(arr[end]);
        for (int i = end - 1; i >= 0; i--) {
            arabian = map.get(arr[i]);
            if (arabian < map.get(arr[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
            }
        }

        return result;
    }
}
