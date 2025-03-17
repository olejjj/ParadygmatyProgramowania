package pl.kolejnik.algorithms;

import pl.kolejnik.datamodels.IComparableObject;

import java.util.List;

public class BubbleSort implements ISortingAlgorithm{

    @Override
    public void sort(List<? extends IComparableObject> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    IComparableObject temp = list.get(j);
                    ((List) list).set(j, list.get(j + 1));
                    ((List) list).set(j + 1, temp);
                }
            }
        }
    }
}
