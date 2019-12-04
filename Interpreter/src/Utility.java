public class Utility {

    public static boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-"))
            return true;
        else
            return false;
    }

    public static Expression getOperator(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new Add(left, right);
            case "-":
                return new Subtract(left, right);
        }
        return null;
    }

}
