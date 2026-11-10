public class Assignment01Q01 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
        String str = args[i];
        char firstchar = str.charAt(0);
        if (firstchar % 5 == 0){
        System.out.println(firstchar);
        }
        }
    }
}
