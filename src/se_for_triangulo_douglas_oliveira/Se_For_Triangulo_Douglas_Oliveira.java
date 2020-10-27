package se_for_triangulo_douglas_oliveira;
import java.util.Scanner;

public class Se_For_Triangulo_Douglas_Oliveira {

 public static void main(String[] args) 
{Scanner entrada;
double A, B, C;
entrada = new Scanner (System.in);
System.out.println ("Digite o valor de A");
A = entrada.nextDouble();
System.out.println("Digite o valor de B");
B= entrada.nextDouble();
System.out.println("Digite o valor de C");
C= entrada.nextDouble();

if(A<B+C||B<A+C||C<A+B){
System.out.println("Trata-se de um triangulo");
}
if( A < B + C && B < A + C && C < A + B ){
if(A==B && B == C){
System.out.print("O triângulo é Eqüilátero.");
}else if(A==B || A==C || B==C){
System.out.print("O triângulo é Isósceles.");
}else{
System.out.print("O triângulo é Escaleno.");
}
}else{
System.out.print("não é um triângulo");
}

}