package caulenhdkhien;

public class VDbreak {
    public static void main(String[] args) {
        first:
        for( int i = 1; i < 5; i++) {

            // the for loop is labeled as second
            second:
            for(int j = 1; j < 3; j ++ ) {
                if ( j == 2)
                    break first;
                System.out.println("i = " + i + "; j = " +j);

                // the break statement terminates the loop labeled as second

            }
        }
        System.out.println("ngom");
    }
}
