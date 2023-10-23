import static java.lang.Math.floor;

import java.util.ArrayList;
import java.util.Arrays;

public class Formatter {
    String Formatter(double price) {
        int modPrice = (int) (floor(price));
        if (modPrice % 100 > 11 && modPrice % 100 < 15)
            modPrice = modPrice % 100;
        else if (modPrice > 11 && modPrice < 15)
            return "рублей";
        else
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

