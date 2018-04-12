package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ZeroSum {

  public static void main(String[] args) {
  }

  public static Set<int[]> zeroSumTriples(int[] data) {
    Set<int[]> sums = new HashSet<>();
    for (int i = 0; i < data.length - 2; i++) {
      for (int j = i + 1; j < data.length - 1; j++) {
        for (int k = i + 2; k < data.length; k++) {
          if (data[i] + data[j] + data[k] == 0) {
            int[] sumsArr = {data[i], data[j], data[k]};
//            Set<int[]> sum = new HashSet<>(Arrays.asList(sumsArr));
            sums.add(sumsArr);
          }
        }
      }
    }
    System.out.println(sums.size());
    for (int[] s : sums) {
      System.out.println(Arrays.toString(s));
    }
    return sums;
  }

}
