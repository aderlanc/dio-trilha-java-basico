public class Operadores {
  public static void main(String[] args) {
    int a, b;
    String resultado = "";

    a = 5;
    b = 6;
    
    if(a==b)
      resultado = "verdadeiro";
    else
      resultado = "falso";
    System.out.println(resultado);
    String ternario = a==b?"verdadeoro":"falso";
    System.out.println(ternario);
   
  }
}
