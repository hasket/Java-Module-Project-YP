import static java.lang.Math.floor;
public class Formatter {
    String Formatter(double price){
        if (floor(price) == 1.00 || floor(price) == 1.0) {
           return "рубль";
       }
        return "рубля";
    }
}
