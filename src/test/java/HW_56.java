public class HW_56 {

    public static void main(String[] args){
        int[][] da = new int[5][8];
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                da[i][j] = (int) (Math.random() * 200 - 100);
            }
        }
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println(); // Переходим на следующую строку
        }
        int max = da[0][0];
        for (int i = 1; i < da.length; i++){
            for(int j=0; j<da[i].length; j++) {
                if (da[i][j] > max) {
                    max = da[i][j];
                }
            }
        }
        System.out.println("Значение максимального элемента массива: " + max);
    }
}
