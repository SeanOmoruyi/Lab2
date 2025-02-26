class NumberPrinter {

    private void printFromAtoB(int a, int b) {

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int i = min; i <= max; i++) {
            System.out.println(i + "");
        }

        System.out.println();
    }

}
