import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses_929 {
    public static void main(String[] args) {
        String[] strings = {"test.email+alex@leetcode.com", "test.email.leet+alex@code.com"};
        System.out.println(new UniqueEmailAddresses_929().numUniqueEmails(strings));
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String s : emails) {
            String[] local = s.split("@");
            String[] firstLocal = local[0].split("\\+");
            firstLocal[0] = firstLocal[0].replace(".", "");
            StringBuilder temp = new StringBuilder(firstLocal[0] + "@" + local[1]);
            set.add(String.valueOf(temp));

        }
        return set.size();

    }
}
