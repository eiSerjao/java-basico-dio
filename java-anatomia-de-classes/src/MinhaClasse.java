public class MinhaClasse {
  
  public static void main(String[] args) {
    // Método principal (ponto de entrada do programa)

    // Declarando variáveis para os nomes
    String primeiroNome = "Paulo"; // Primeiro nome
    String segundoNome = "Sérgio"; // Segundo nome

    // Chamando o método nomeCompleto para combinar os nomes e armazenar o resultado
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    // Imprimindo o nome completo na saída padrão
    System.out.println(nomeCompleto);
}

// Método para combinar os nomes e retornar o nome completo
public static String nomeCompleto(String primeiroNome, String segundoNome) {
    // Concatenando os nomes e adicionando um prefixo
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}
