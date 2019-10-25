public class Calculator {
    private int num1;
    private int num2;
    public Calculator(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void add(int num1,int num2){
        sum = num1 + num2;
        System.out.println("result:"+ sum);
    }
    public void sub(int num1,int num2){
        ret = num1 - num2;
        System.out.println("result:"+ ret);
    }
    public void mul(int num1,int num2){
        ret = num1 * num2;
        System.out.println("result:"+ ret);
    }
    public void div(int num1,int num2){
        ret = num1 / num2;
        System.out.println("result:"+ ret);
    }

}
