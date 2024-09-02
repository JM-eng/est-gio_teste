public class Main
{
    
	public static void main(String[] args) {
        String input = "A string de teste para avaliar o algoritmo criado";

        int cont = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == 'a' || c == 'A') {
                cont++;
            }
        }

        if (cont > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + cont + " vezes.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece na string.");
        }
    }
}
