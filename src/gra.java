import java.math.BigDecimal;

public class gra {
    private BigDecimal price;

    public gra(BigDecimal price)   {
        this.price=price;
    }
public BigDecimal price(Vat vat) {
    return price.add(vat.calculate(price));
}

}
