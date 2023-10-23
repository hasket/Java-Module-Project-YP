import static java.lang.Math.floor;
public class Formatter {
    String Formatter(double price){
        int modPrice = (int) (floor(price) % 10);
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
