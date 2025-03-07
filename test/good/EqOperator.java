class EqOperator {
    public static void main(String[] a) {
        {
            System.out.println(new Test().testAll());
        }
    }
}



class Test {
    DummyClass d1;
    DummyClass d2;
    int res;

    public int testAll() {
        int res;
        res = this.testClass();
        return 0;
    }

    public int testClass() {
        d1 = new DummyClass();
        d2 = new DummyClass();
        
        res = d1.setV(1);
        res = d2.setV(1);
        
        if (d1 == d2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        return 0;
    }
}

class DummyClass {
    int value;

    public int setV(int v) {
        value = v;
        return 0;
    }
}