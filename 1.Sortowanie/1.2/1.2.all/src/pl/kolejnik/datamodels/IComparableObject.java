package pl.kolejnik.datamodels;

public interface IComparableObject {

    /*
    Porównuje osoby, wyniki:
    * this.name < other.name ->>> -1
    * this.name > other.name ->>>  1
    * this.name == other.name ->>> 0
    */

    int compareTo(IComparableObject other);
}
