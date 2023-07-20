package java_essential.testDir.genericTypeTest.test2;

// универсальный шаблон

public class GenericTypeTest2<TYPE1, TYPE2> {
    public TYPE1 variable1;
    public TYPE2 variable2;

    public GenericTypeTest2(TYPE1 argument1, TYPE2 argument2) {
        this.variable1 = argument1;
        this.variable2 = argument2;
    }
}

