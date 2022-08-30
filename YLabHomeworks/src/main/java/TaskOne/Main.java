package TaskOne;

public class Main {

    public static class myRnd {
        private final int max;
        private int last;

        public myRnd(int max) {
            this.max = max;
            last = (int) (System.currentTimeMillis() % max);
        }

        public int nextInt() {
            last = (last * 32719 + 3) % 32749;
            return last % max;
        }
    }

    public static void main(String[] args) {

        myRnd random = new myRnd(50);

        int size = 10;

        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt();
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

        int max = array[0][0];
        int min = array[0][0];
        int avg = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < ints[j])
                    max = ints[j];
                if (min > ints[j])
                    min = ints[j];
                avg += ints[j] / array.length;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}