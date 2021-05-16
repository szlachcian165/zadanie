import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Vat aktualnyVat = new vat32();
        gra gra = new gra(BigDecimal.TEN);
        System.out.println(gra.price(aktualnyVat));
    }
}