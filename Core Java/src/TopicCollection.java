import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TopicCollection {
    /* (Set)Find true friends: Given two arraylists containing friend names,
    find the true friends that appear in both list. */
    public ArrayList<String> findFriends(ArrayList<String> friends1, ArrayList<String> friends2) {
        ArrayList<String> ans = new ArrayList<>();
        HashSet<String> seen = new HashSet<>(friends1);

        for (String name: friends2) {
            if (seen.contains(name)) {
                ans.add(name);
            }
        }
        return ans;
    }

    /* (Map)Given a string, output duplicate characters and their counts */
    public Map<Character, Integer> duplicateCharacters(String str) {
        Map<Character, Integer> cnter = new HashMap<>();
        Map<Character, Integer> ans = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (cnter.containsKey(c)) {
                cnter.put(c, cnter.get(c) + 1);
            }
            else {
                cnter.put(c, 1);
            }

            if (cnter.get(c) > 1) {
                ans.put(c, cnter.get(c));
            }
        }
        return ans;
    }

    /* Use a map to simulate database table, key should be the primary key (assume only one column),
    value is the record, your simulation should include CRUD operation methods */
    public static class MyDB {
        Map<Object, ArrayList<Integer>> database = new HashMap<>();
        int cap = 0;

        public void create(Object key, int value) {
            ArrayList<Integer> valueList;
            if (database.containsKey(key)) {
                valueList = database.get(key);
            }
            else {
                valueList = new ArrayList<>();
            }
            valueList.add(value);
            database.put(key, valueList);
            cap++;
        }

        public void read(Object key) {
            System.out.println("*** " + database.get(key) +" ***");
        }

        public void update(Object key, ArrayList<Integer> valueList) {
            database.put(key, valueList);
        }

        public void delete(Object key) {
            database.remove(key);
            cap--;
        }
    }
}