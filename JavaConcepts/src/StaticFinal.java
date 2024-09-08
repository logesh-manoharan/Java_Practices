/*
1.Variable
    static -
            initialized only once, when the class is mounted.
            It can be overwritten.
            uses single memory space.
    final  -
            Constant.
            Initialised while declaring, or in Constructor.

2.Method
    static -
            overriding in sub-class hides the method in super class
            Used while creating utilities(Mathematical Calc, String Manipulations).
    final  -
            overriding the method raises Compilation error

3.Class
    static -
            only used as nested classes.
            it wont have any reference to the super class. it can be initialised without the instance of super class.
            it can only access the static members of the super class.
            Just for logical grouping.
    final  -
            cannot be sub-classed
*/
public class StaticFinal {

}
