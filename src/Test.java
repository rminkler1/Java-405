import java.math.BigDecimal;
import java.math.RoundingMode;

class Test {
    public static void main(String[] args) {

        BigDecimal oneThirdWrong = new BigDecimal(1.0 / 3);

        System.out.println(oneThirdWrong);
        // OUTPUT 0.333333333333333314829616256247390992939472198486328125

        BigDecimal one = new BigDecimal("1");
        BigDecimal three = new BigDecimal("3");
        BigDecimal oneThird = one.divide(three, 100, RoundingMode.FLOOR);

        System.out.println(oneThird);
        // OUTPUT 0.3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333
    }
}