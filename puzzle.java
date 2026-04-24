// 14 by 14 array
//(Apologies, but we’ve drawn a blank with this puzzle’s instructions. One thing we do know is that the answer is a positive integer…)
//char ch = '5';
//int asciiValue = ch; // Result: 53 (ASCII value for '5')
class puzzle {

    private char[][] current;

    public static void main(String[] args) {
        puzzle p = new puzzle();
        p.printgrid(p.intgrid());
    }

    puzzle(){
        current = original();
    }
// 1. GRIDS ---
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

    public char[][] intgrid(){
        current = original();
        char[][] x = new char[14][14];
        for (int r = 0; r < 14; r++) {
            for (int c = 0; c < 14; c++) {
                x[r][c] = (char)(current[r][c] - 96);
            }
        }
        return x;
    }
// ---

// 2. HELPERS ---
    public void printgrid(char[][] grid){
        for (int r = 0; r < 14; r++) {
            for (int c = 0; c < 14; c++) {
                System.out.print(grid[r][c] + "|");
            }
            System.out.println();
        }
    }

    private char[] column(int x, char[][] grid){
        char[] c = new char[14];
        for (int i = 0; i < 14; i++) {
            c[i] = grid[i][x];
        }
        return c;
    }

    public int linetotal(char[] r){
        int x = 0;
        for (char i : r) {
            x += i - 48 ;
        }
        return x;
    }
// 3. CALCULATORS 
//     public int[][] gridtotals(){
//         int[][] x = new int[2][14];
//         for (int i = 0; i < 14; i++) {
//             x[0][i] = linetotal(int);   // row totals
//             x[1][i] = linetotal(column(i)); // column totals
//         }
//         return x;
//     }
//     public int[][] modulo(){
//         int[][] x = new int[2][14];
//         for (int i = 0; i < 14; i++) {
//             x[0][i] = totals[0][i]%24;
//             x[1][i] = totals[0][i]%24;
//         }
//         return x;
//     }
 }