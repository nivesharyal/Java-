package Variable;

public class Variables {
    //static
    static int x = 5;

    // instance variable



    //local variable:
    public void localVariable(){
        int x = 5;
        System.out.println(x);

    }
    public static void main(String[] args){
        Variables var= new Variables();
        var.localVariable();

    }
}
