import jade.core.Agent;

public class PassingInfoAgent extends Agent {

    private String LivroComprar;

    @Override
    protected void setup() {

        // imprime mensagem de Bem−Vindo
        System.out.println("Olá !!! Eu sou o Agente Comprador " + getLocalName()
                + " e estou pronto para comprar !");
        // Realiza a captura do nome do livro quando passado como argumento na
        // inicialização
        Object[] args = getArguments();
        if (args != null && args.length > 0) {
            LivroComprar = (String) args[0];
            System.out.println("Livro a ser comprado: " + LivroComprar);
        } else {
            // Finaliza o agente se não houver argumento
            System.out.println("Nenhum livro foi informado.");
            doDelete(); // invoca a execução do método TakeDown()
        }
    }

    protected void takeDown() {
        // imprime mensagem de despedida
        System.out.println("Agente Comprador " + getAID().getName() + " finalizando.");
    }
}