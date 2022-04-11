import java.util.*;
class Main {
public static void main(String[] args) {
Scanner leitor = new Scanner (System.in);
//variável
int numero = 0;
int centena = 0;
int dezena = 0;
int unidade = 0;
// Entrada de Dados
System.out.println("Digite Número :");
numero = leitor.nextInt();
//processamento
unidade = numero % 10;
numero = numero - unidade;
numero = numero / 10;
dezena = numero % 10;
numero = numero - dezena;
numero = numero / 10;
centena = numero % 10;
numero = numero - centena;
numero = numero / 10;
//saída
System.out.println("Dezena :" + dezena);

}
}