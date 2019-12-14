package pl.jlabs.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {
    public static float round(double d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        bd = bd.setScale(decimalPlace, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
}
