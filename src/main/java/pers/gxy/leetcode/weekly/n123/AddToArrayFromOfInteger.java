package pers.gxy.leetcode.weekly.n123;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFromOfInteger {

    public List<Integer> addToArrayFrom(int[] A, int K) {
        List<Integer> re1 = new ArrayList<>();
        List<Integer> re = new ArrayList<>();
        int jinwei = 0;
        int num = 10;
        for (int i = A.length - 1; i >= 0; i--) {
            if (K < 1) {
                if (jinwei != 0) {
                    int j = A[i] + jinwei;
                    jinwei = j / 10;
                    re.add(j % 10);
                } else {
                    re.add(A[i]);
                }

            } else {
                int add = K % num;
                int j = A[i] + add + jinwei;
                jinwei = j / 10;
                re.add(j % 10);
                K = K / 10;
            }
        }
        while (K >= 1) {
            // re.add(K % 10);
            // K = K / 10;
            if (jinwei != 0) {
                int j = K % 10 + jinwei;
                jinwei = j / 10;
                re.add(j % 10);
            } else {
                re.add(K % 10);
            }
            K = K / 10;
        }
        if (jinwei != 0) {
            re.add(jinwei);
        }

        for (int i = re.size() - 1; i >= 0; i--) {
            re1.add(re.get(i));
        }
        return re1;

    }

}
