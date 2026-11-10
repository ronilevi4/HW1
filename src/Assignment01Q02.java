public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        String str = args[0];
        int n = Integer.parseInt(str);
        for (int i=0; i<n; i++){
            if (i % 2 == 0){
                approxPi += 1.0 / (2 * i + 1);
            } else {
                approxPi -= 1.0 / (2 * i + 1);
            }
        }   
        approxPi *= 4;     
        System.out.println(approxPi + " " + actualPi);
    }
}
