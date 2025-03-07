class OrOperator {
    public static void main(String[] args) {
        {
            if (true || false) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
            if (false || true)
                System.out.println(1);
            else
                System.out.println(2);
            if (false || false)
                System.out.println(2);
            else
                System.out.println(1);
        }
    }
}