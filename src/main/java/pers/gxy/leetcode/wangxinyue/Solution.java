package pers.gxy.leetcode.wangxinyue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    List<List<Integer>> c(int numDestinations, List<List<Integer>> allLocations, int numDeliveries) {
        if (allLocations.size() != numDestinations) {
            return null;

        }
        if (numDeliveries > numDestinations) {
            return null;

        }
        Map<Double, List<Integer>> map = new HashMap<>();
        List<Double> distances = new ArrayList<>();
        for (List<Integer> list : allLocations) {
            int x = list.get(0);
            int y = list.get(1);
            Double d = Math.sqrt(x * x + y * y);
            distances.add(d);
            map.put(d, list);
        }
        Collections.sort(distances);
        List<List<Integer>> re = new ArrayList<>();
        for (int i = 0; i < numDeliveries; i++) {
            re.add(map.get(distances.get(i)));

        }

//        printlist(re);

        return re;

    }

    public List<List<Integer>> name(int numDestinations, List<List<Integer>> allLocations, int numDeliveries) {
        List<Integer> loacl = new ArrayList<>();
        List<List<Integer>> re = new ArrayList<>();
        loacl.add(0);
        loacl.add(0);
        for (int i = 0; i < numDeliveries; i++) {
            // System.out.println("当前loacl" + loacl.get(0).toString() +
            // loacl.get(1).toString());
            Double mind = -1.0;
            List<Integer> nextp = new ArrayList<>();
            for (List<Integer> list : allLocations) {
                int x = list.get(0);
                int y = list.get(1);
                int x_l = loacl.get(0);
                int y_l = loacl.get(1);
                int xx = Math.abs(x - x_l);
                int yy = Math.abs(y - y_l);
                Double d = Math.sqrt(xx * xx + yy * yy);
                if (mind.equals(-1.0)) {
                    mind = d;
                    nextp = list;
                } else if (mind > d) {
                    mind = d;
                    nextp = list;
                }
            }
            loacl = nextp;
            // System.out.println("最近点是" + loacl.get(0).toString() +
            // loacl.get(1).toString());
            allLocations.remove(loacl);
            re.add(loacl);
        }
        printlist(re);
        return re;
    }

    static void printlist(List<List<Integer>> allLocations) {
        System.out.print("[");
        for (List<Integer> list : allLocations) {
            System.out.printf("(%d,%d),", list.get(0), list.get(1));
        }
        System.out.println("]\r\n");
    }

    static void test01() {
        int numDestinations = 3;
        List<List<Integer>> allLocations = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(-1);
        allLocations.add(list);
        allLocations.add(list2);
        allLocations.add(list3);
        int numDeliveries = 2;

        Solution s = new Solution();
        s.c(numDestinations, allLocations, numDeliveries);
        s.name(numDestinations, allLocations, numDeliveries);
        System.out.println("=========t1============");
    }

    static void test02() {
        int numDestinations = 3;
        List<List<Integer>> allLocations = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(4);
        allLocations.add(list);
        allLocations.add(list2);
        allLocations.add(list3);
        int numDeliveries = 1;

        Solution s = new Solution();
        s.c(numDestinations, allLocations, numDeliveries);
        s.name(numDestinations, allLocations, numDeliveries);
        System.out.println("=========t2============");
    }

    static void test03() {
        int numDestinations = 6;
        List<List<Integer>> allLocations = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(3);
        List<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(7);
        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(8);
        List<Integer> list6 = new ArrayList<>();
        list6.add(7);
        list6.add(9);
        allLocations.add(list);
        allLocations.add(list2);
        allLocations.add(list3);
        allLocations.add(list4);
        allLocations.add(list5);
        allLocations.add(list6);
        int numDeliveries = 3;

        Solution s = new Solution();
        s.c(numDestinations, allLocations, numDeliveries);
        s.name(numDestinations, allLocations, numDeliveries);
        System.out.println("=========t3============");
    }

    public static void main(String[] args) {

        test01();
        test02();
        test03();
    }
}