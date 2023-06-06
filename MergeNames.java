import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        
		HashSet<String> names1Set = new HashSet<>(Arrays.asList(names1));
		HashSet<String> names2Set = new HashSet<>(Arrays.asList(names2));
		HashSet<String> unionSet = new HashSet<>(names1Set);
		unionSet.addAll(names2Set);

		System.out.println(new String[unionSet.size()]);
		return unionSet.toArray(new String[unionSet.size()]);
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}