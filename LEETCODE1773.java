import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LEETCODE1773{
    public static void main(String[] args) {
        String ruleValue = "phone";
        String ruleKey = "type";
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("phone","gold","iphone"));
        items.add(Arrays.asList("computer","silver","phone"));
        int index;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }
        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
