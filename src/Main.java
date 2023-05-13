public class Main {
    public static void main(String[] args) {
        CalculateComplex calcCompl1 = new CalculateComplex(15, 37);
        calcCompl1.setW(2.0);
        calcCompl1.setZ(3.3);
        System.out.printf("sum = " + calcCompl1.sum());
    }


}

