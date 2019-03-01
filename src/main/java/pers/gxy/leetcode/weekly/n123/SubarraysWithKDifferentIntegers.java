package pers.gxy.leetcode.weekly.n123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SubarraysWithKDifferentIntegers {
    public int subarraysWithKDifferent(int[] A, int K) {
        List<int[]> subarrays = new ArrayList<>();
        int windowsLength = K;
        Set<Integer> windows = new HashSet<>();
        while (windowsLength < A.length) {
            for (int i = 0, j = i + windowsLength - 1; i < A.length && j < A.length; i++, j = i + windowsLength - 1) {
                System.out.println("i：" + i + ",j：" + j + ",windowsLength:" + windowsLength);
                int[] subarray = Arrays.copyOfRange(A, i, j + 1);
                printarray(subarray);
                for (int l : subarray) {
                    windows.add(l);

                }

                if (windows.size() == K) {
                    subarrays.add(subarray);
                    System.out.print("加入集合");
                    printarray(subarray);
                }
                windows.clear();
            }
            windowsLength++;
        }
        // print(subarrays);
        return subarrays.size();
    }

    public int subarraysWithKDifferent2(int[] A, int K) {
        int num = 0;
        int left = 0;
        Set<Integer> windows = new HashSet<>();
        List<Integer> l = new ArrayList();
        for (int i = 0; i < A.length; i++) {
            windows.add(A[i]);
            l.add(A[i]);
            System.out.println("窗口中新增元素" + A[i]);
            printlist(l);
            if (windows.size() == K) {
                num++;
            } else if (windows.size() > K) {
                System.out.println("窗口元素清空");
                windows.clear();
                l.clear();
                left++;
                i = left - 1;
            }
            if (left != A.length-1 && i == A.length-1) {
                System.out.println("窗口元素清空");
                windows.clear();
                l.clear();
                left++;
                i = left - 1;
            }
        }
        return num;
    }

    private void print(List<int[]> subarray) {
        for (int[] is : subarray) {
            for (int i : is) {
                System.out.print(i + ",");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void printarray(int[] array) {
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();

    }

    private void printlist(List<Integer> array) {
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();

    }
}
