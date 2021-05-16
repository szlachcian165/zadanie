import java.math.BigDecimal;

public class vat32 implements Vat{
    @Override
    public BigDecimal calculate(BigDecimal value) {
        return value.multiply(BigDecimal.valueOf(0.32));
    }
}
