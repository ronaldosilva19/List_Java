package com.gradle.Generics;

import java.util.List;

public class Generics
{
    public static <T extends Comparable<T>> void SortedVector(List<T> vector){
        T aux;
        for(int i = 0; i < vector.size() - 1; i++)
        {
            for(int j = 0; j < vector.size() - i - 1; j++)
            {
                if(vector.get(j).compareTo(vector.get(j + 1)) > 0)
                {
                    aux = vector.get(j + 1);
                    vector.set(j + 1, vector.get(j));
                    vector.set(j, aux);
                }
            }
        }
    }

    public static<T> void PrintVectorSorted(List<T> vector)
    {
        System.out.print("[ ");
        for(int i = 0; i < vector.size(); i++)
        {
            if(i == vector.size() - 1)
            {
                System.out.print(vector.get(i) + " ");
            }else {
                System.out.print(vector.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
