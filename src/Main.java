public class Main {
    public static void main(String[] args) {

        // contruindo balao();
        balao b1 = new balao();

        balao b2 = new balao(10, "azul", "grande", 1.43, 23.65, "grande", 4);
        balao b3 = new balao(12, "vermelho", "pequeno", 1.21, 78.92, "medio", 12);

        // construindo pessoa
        pessoa p1 = new pessoa("Raquel", "7498119", 795345, 55119433, 551193432, "rua. Limoeiro");
        pessoa p2 = new pessoa("Mayara", "7600456", 439023, 55110349, 551190549, "rua. Goiania");

        // construindo piloto
        piloto pi1 = new piloto("Gabriel", "7235861", 842394);


       }
    }
