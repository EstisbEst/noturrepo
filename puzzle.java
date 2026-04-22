// 14 by 14 array
//(Apologies, but we’ve drawn a blank with this puzzle’s instructions. One thing we do know is that the answer is a positive integer…)
class puzzle {
    public static void main(String[] args) {
        puzzle p = new puzzle();
        p.printgrid(null);
    }
    
    puzzle(){
        int[][] totals = gridtotals();
        int total = 0;
        for(int i : totals[0]) total += i;
        System.out.println(total);
    }
    // helpers
    public void printgrid(String a){
        if (a.equals("char")) {
            char[][] orig = original();
            for (int r = 0; r < 14; r++) {
                for (int c = 0; c < 14; c++) {
                    System.out.print(orig[r][c] + "|");
                }
                System.out.println("");
            }
        } else if (a.equals("int")){
            int[][] intg = intgrid();
            for (int r = 0; r < 14; r++) {
                for (int c = 0; c < 14; c++) {
                    System.out.print(intg[r][c] + "|");
                }
                System.out.println("");
            }
        }

    }
    public int[] column(int x){
        int[] c = new int[14];
        for (int i = 0; i < 14; i++) {
            c[i] = intgrid[i][x];
        }
    }



    public char[][] original(){
        return new char [][]{
        {'r','s','d','i','f','i','n','d','t','h','s','a','r','t'},
        {'e','h','r','e','s','o','d','a','e','e','t','g','n','a'},
        {'n','e','t','r','h','a','l','x','h','g','o','w','i','p'},
        {'e','g','e','d','a','u','y','u','e','a','e','n','r','p'},
        {'p','t','n','n','m','l','l','m','x','i','d','n','e','e'},
        {'o','h','u','i','n','k','t','h','a','n','a','c','s','m'},
        {'a','l','n','p','f','y','l','d','e','b','s','t','t','n'},
        {'u','u','m','j','a','r','e','b','e','m','e','h','r','w'},
        {'m','i','t','h','d','c','e','i','g','i','u','g','t','s'},
        {'t','l','a','m','i','b','f','t','o','t','e','g','e','t'},
        {'s','a','i','l','n','i','i','t','n','i','a','p','e','n'},
        {'n','s','t','o','a','g','r','n','i','i','o','b','r','t'},
        {'i','e','t','i','r','y','e','e','s','p','r','a','y','w'},
        {'t','u','n','e','n','t','y','-','t','e','s','s','i','x'}
        };
    }
    public int[][] intgrid(){
        char[][] orig = original();
        int [][] x = new int[14][14];
        for (int r = 0; r < 14; r++) {
            for (int c = 0; c < 14; c++) {
                x[r][c] = (int) orig[r][c] - 96;
            }
        }
        return x;
    }
    public int total(int[] r){
        int x = 0;
        for (int i : r) {
            x += i;
        }
        return x;
    }
    public int[][] gridtotals(){
        int[][] x = new int[2][14];
        int[][] intg = intgrid();
        for (int i = 0; i < 14; i++) {
            //row counts on top row
            x[0][i] = total(intg[i]);
            //column counts on bottom row
            x[1][i] = total(column(i));
        }
        return x;
    }
}