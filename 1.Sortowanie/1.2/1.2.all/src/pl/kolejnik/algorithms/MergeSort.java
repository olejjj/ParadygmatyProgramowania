package pl.kolejnik.algorithms;

import pl.kolejnik.datamodels.IComparableObject;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements ISortingAlgorithm{

    @Override
    public void sort(List<? extends IComparableObject> list) {
        List<IComparableObject> sorted = mergeSort(new ArrayList<>(list));

        for (int i = 0; i < list.size(); i++) {
            ((List) list).set(i, sorted.get(i));
        }
    }
    private List<IComparableObject> mergeSort(List<IComparableObject> list) {
        if (list.size() <= 1) {
            return list;
        }
        int mid = list.size() / 2;
        List<IComparableObject> left = mergeSort(new ArrayList<>(list.subList(0, mid)));
        List<IComparableObject> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())));
        return merge(left, right);
    }

    private List<IComparableObject> merge(List<IComparableObject> left, List<IComparableObject> right) {
        List<IComparableObject> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }
        return result;
    }

}

