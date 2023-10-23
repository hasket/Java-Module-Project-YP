import static java.lang.Math.floor;

import java.util.Arrays;

public class Formatter {
    String Formatter(double price) {
        int modPrice = (int) (floor(price));
        int[] exceptNumbres = {111, 112, 113, 114};
        for (int num : exceptNumbres) {
            if (num == modPrice) {
                return "рублей";
            }
        }
        modPrice = modPrice % 10;
// Это студия такой красивый формат(котлин стайл)
// привела, сам не догадался =(
        return switch (modPrice) {
            case 1 -> "рубль";
            case 2 -> "рубля";
            case 3 -> "рубля";
            case 4 -> "рубля";
            default -> "рублей";
        };
    }
}

