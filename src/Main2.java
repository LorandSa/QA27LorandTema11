public class Main2 {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        op.printToHundred(1); // 1.display numbers from input to 100
        op.printToMinusHundred(0); // 2.display numbers from input to -100
        op.decrease(44,31); //3.display numbers between x & y (including x &y)
        System.out.println(op.getAvgInterval(111,8899));
        System.out.println(op.getAvgForEvenInterval(1,100));

    }
}
