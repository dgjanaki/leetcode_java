import java.util.Arrays;
import java.util.List;

class count_item_match {
    public static void main(String[] args) {

        List<List<String>> items = Arrays.asList(
            Arrays.asList("phone", "blue", "pixel"),
            Arrays.asList("computer", "silver", "phone"),
            Arrays.asList("phone", "gold", "iphone")
        );

        String ruleKey = "type";
        String ruleValue = "phone";

        System.out.println(find(items, ruleKey, ruleValue));
    }

    static int find(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index;

        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}