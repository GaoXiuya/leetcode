package pers.gxy.leetcode.n692;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<Key> keys = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            Key key = new Key(words[i], 1);
            int j = keys.indexOf(key);
            if (j < 0) {
                keys.add(key);
            } else {
                keys.get(j).count++;
            }
        }
        List<String> re = keys.stream().sorted(Comparator.comparing(Key::getCount).reversed().thenComparing(Key::getName)).map(Key::getName).collect(Collectors.toList());
        return k > re.size() ? re : re.subList(0, k);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int k = 3;
        String[] words = { "i", "love", "leetcode", "i", "love", "coding" };
        List<String> l = s.topKFrequent(words, k);
        for (String x : l) {
            System.out.print(x + ",");
        }

    }
}

class Key {
    String name;
    Integer count;

    // /**
    // * @param name
    // * @param count
    // */
    // public Key(Key key, Integer count) {
    // this.name = key.name;
    // this.firstIndex= key.firstIndex;
    // this.count = count;
    // }

    public Key(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Key other = (Key) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}