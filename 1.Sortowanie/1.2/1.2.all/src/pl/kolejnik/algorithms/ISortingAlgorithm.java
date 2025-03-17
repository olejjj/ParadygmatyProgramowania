package pl.kolejnik.algorithms;

import pl.kolejnik.datamodels.IComparableObject;

import java.util.List;

public interface ISortingAlgorithm {

    void sort(List<? extends IComparableObject> list);
}
