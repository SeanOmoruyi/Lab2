class NumberPrinter {

    private void printFromAtoB(int a, int b) {

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int i = min; i <= max; i++) {
            System.out.println(i + "");
        }

        System.out.println();
    }

    public void printXtoY(int x, int y) {
        System.out.println("Printing " + y + " numbers starting from " + x);
        printFromAtoB(x, x + y - 1);
    }

    public void printFromStrings(String str1, String str2) {

    }

}
