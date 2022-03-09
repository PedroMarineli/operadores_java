public class operadores{
    public static void main(String[] args){
        int num = 500000001;

        String msg =(num % 2 == 0) ? "Número par" : "Número impar";
        System.out.println(msg);
    }
}
