package com.jvi.random;

public class RandomPortGenerator {

  public int generatePortInRange(int min, int max) {
    return (int)(Math.random() * (max - min + 1) + min);
  }

  public int generatePortInRange(String range) {
    int min = Integer.valueOf(range.split("-")[0]);
    int max = Integer.valueOf(range.split("-")[1]);
    return (int)(Math.random() * (max - min + 1) + min);
  }

  public int generatePortInRange() {
    return 66;
  }
}
