public class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */
    
    // TESTES:
    public static void main(String[] args) {
        System.out.println(superDigit("14", 2));
        System.out.println(superDigit("9875", 4));
        System.out.println(superDigit("123", 3));
    }

    public static int superDigit(String n, int k) {
    // Write your code here
        int result = 0;
        String m = "";

        for (int i=0; i<k; i++){
            m+=n;
            if (m.length() == 1){
                return Integer.parseInt(m);
            }
        }

        for(int i = 0; i < m.length(); i++) {
            result += Integer.parseInt(Character.toString(m.charAt(i)));
        }

        String varStr = String.valueOf(result);
        
        return superDigit(varStr, 1);        
    }
}