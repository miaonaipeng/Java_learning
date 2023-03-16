package quickstart;

public class Main {
    public static void main(String[] args) {
        int mountain = 8844430;
        double paper = 0.1;
        int count = 0;
//        for(;paper < mountain; paper*=2){
//            count++;
//        }
        while (paper < mountain) {
            paper *= 2;
            count++;
        }
        System.out.println(count);

    }
}
