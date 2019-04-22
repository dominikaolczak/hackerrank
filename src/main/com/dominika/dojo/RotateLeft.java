package com.dominika.dojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateLeft {

    static int[] solution(int[] a, int d) {
        int size = a.length;
        int Rotation_Number = a.length - d;
        int arr[] = new int[size];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(Integer.valueOf((a[i])));
        }
        Collections.rotate(list, Rotation_Number);
        int[] res = list.stream().mapToInt(i -> i).toArray();
        return res;
    }
}
