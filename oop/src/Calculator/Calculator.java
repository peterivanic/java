package Calculator;

public class Calculator {

    public int result = 0 ;

    public int sum(int n, int m) {
        int result = n + m;
        this.result = this.result + result;
        return result;
    }

    public int deduction(int n, int m) {

        int result = n - m;
        this.result = this.result + result;
        return result;
    }

    public int divide(int n, int m) {

        int result = n / m;
        this.result = this.result + result;
        return result;
    }
    public int multiple(int n, int m) {
        int result = n * m;
        this.result = this.result + result;
        return result;
    }
}
