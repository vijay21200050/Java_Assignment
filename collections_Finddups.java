public class FindDups {
    public static void main(String[] args) {
        SortedSet<String> s = new TreeSet<String>(case_insensitive);        
    
        for (String a : args) {
               s.add(a);
        }
        System.out.println(s.size() + " distinct words by ignoring case: " + s);
    }
    
    static final Comparator<String> case_insensitive = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    };