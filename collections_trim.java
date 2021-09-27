public class trim {
    static void trim(List<String> strings) {
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) {
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList(" naruto ", " demon ", " kansuro ");
        trim(l);
        for (String s : l) {
            System.out.format("\"%s\"%n", s);
        }
    }
}