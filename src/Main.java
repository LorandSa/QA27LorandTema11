public class Main
{
    public static void main(String[] args)
    {
        Calculator suma = new Calculator();
        suma.CalcSum();
        suma.CalcMinus();
        suma.CalcInmultire();
        suma.CalcImpartire();

        LogicalOp Logical = new LogicalOp();
        Logical.Shownumber();
        Logical.TextComparison();

    }
}