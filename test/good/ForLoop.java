class ForLoop {
    public static void main(String[] args) {
        System.out.println(new For().test());
    }    
}

class For {
    public int test() {
        int i;
        for (i = 0 ; i < 10 ; i = i + 1) {
            System.out.println(i);
        }
        return 1;
    }
}
