package capitulo1;

public class PhraseOMatic {
    static void main() {

        //1. As listas : Arrays (Gavetas com palavras)
        String[] listas1 = {"Eu preciso", "O mercado pode", "O gerente quer"};
        String[] listas2 = {"focar em", "destruir", "codar"};
        String[] listas3 = {"bugs", "cafe", "produtividade"};

        //2. Descobrindo quantas palavras tem
        int tamanho1 = listas1.length;
        int tamanho2 = listas2.length;
        int tamanho3 = listas3.length;

        //3. A Magica (gera 0, 1 ou 2)
        int rand1 = (int) (Math.random() * tamanho1);
        int rand2 = (int) (Math.random() * tamanho2);
        int rand3 = (int) (Math.random() * tamanho3);

        //4.Montando a Frase (Pegando o que está na gaveta sorteada)
        String frase = listas1[rand1] + " " + listas2[rand2] + " " + listas3[rand3];

        //5 Mostrando
        System.out.println("tudo o que dizemos é: " + frase);
    }
}
