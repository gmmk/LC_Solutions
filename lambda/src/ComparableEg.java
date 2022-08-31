import java.util.Comparator;

public class ComparableEg {
    public static Comparator<String> stringLengthComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    };

    public static Comparator<String> lambdaStringLengthComparator
            = (stringOne, stringTwo) -> Integer.compare(stringOne.length(), stringTwo.length());

    public static void main(String[] args) {
        System.out.println(lambdaStringLengthComparator.compare("Christ", "Krishna"));
    }
}
