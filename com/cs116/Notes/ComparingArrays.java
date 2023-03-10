package com.cs116.Notes;

public class ComparingArrays {
    public static void main(String[] args) {
        double[] cellBills1 = {45.24, 54.67, 42.55, 44.61, 65.29, 49.75};
        double[] cellBills2 = {45.24, 54.67, 41.99, 44.61, 65.29, 49.75};

        boolean isEqual = true;
        
        if(cellBills1.length != cellBills2.length)
          isEqual = false; // arrays are not the same size
        else {
          for(int i = 0; i < cellBills1.length && isEqual; i++)
            if (Math.abs(cellBills1[i] - cellBills2[i]) >0.001)
               isEqual = false; // elements are not equal
          }
        if(isEqual)
            System.out.println("cellBills1 and cellBills2 are equal");
        else
            System.out.println("cellBills1 and cellBills2  not equal");
  }
}
