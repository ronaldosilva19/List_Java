package com.gradle.Generics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> inteiros = Arrays.asList(100, 200, 0, -5, 99, 11, 10, 7, 88);
        List<String> string = Arrays.asList("Ronaldo", "Polina", "Ani", "Dima", "Sergey", "Lyudmila");
        List<Double> doubles = Arrays.asList(99.5, 88.8, 66.6, -7.0, 10.0, 4.0, 0.0);

        Generics.SortedVector(inteiros);
        Generics.PrintVectorSorted(inteiros);

        Generics.SortedVector(string);
        Generics.PrintVectorSorted(string);

        Generics.SortedVector(doubles);
        Generics.PrintVectorSorted(doubles);

    }
}
