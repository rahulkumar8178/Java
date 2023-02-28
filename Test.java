public class Test {
    public static void main(String[] args){
        int[][][] x = {{{10,20},{30,40}},{{50,60,70},{80,90}}};

        for (int[][] x1 : x) {
            for (int[] x2 : x1) {
                for (int x3 : x2) {
                    System.out.print(x3 + " ");
                }
                
            }
            
        }
          
    }
}
