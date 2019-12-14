package pl.jlabs.library;

public class DoingSomething {
    public static String addDashBetweenChars(String input) {
        StringBuilder sb = new StringBuilder();
        input.chars().mapToObj(c -> (char) c).forEach(c -> sb.append(c).append('-'));
        return sb.toString().substring(0, sb.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(DoingSomething.addDashBetweenChars("dupa"));
    }
}
