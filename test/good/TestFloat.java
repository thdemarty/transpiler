class TestFloat {
    public static void main(String[] args) {
        System.out.println(.3f);
        System.out.println(1.0f + 1.2f + new MyFloat().test());
    }   
}


class MyFloat {
    public float test() {
        return 1.16f;
    }
}
