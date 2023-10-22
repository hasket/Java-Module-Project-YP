import static java.lang.Math.floor;
public class Formatter {
    String Formatter(double price){
// Это студия такой красивый формат(котлин стайл)
// привела, сам не догадался =(
        return switch ((int) floor(price)) {
            case 1 -> "рубль";
            case 3 -> "рубля";
            case 4 -> "рубля";
            default -> "рублей";
        };
    }
}
