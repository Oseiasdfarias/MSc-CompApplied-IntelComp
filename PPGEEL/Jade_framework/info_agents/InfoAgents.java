import jade.core.Agent;
import java.util.Iterator;

public class InfoAgents extends Agent {

    protected void setup() {
        System.out.println("Hello World. Eu sou um agente!");
        System.out.println("Todas as minhas informações: \n" + getAID());
        System.out.println("Meu nome local: " + getAID().getLocalName());
        System.out.println("Meu nome global (GUID) é:" + getAID().getName());
        System.out.println("Meus Endereços São:");

        // Suprimindo o aviso de segurança de tipo
        @SuppressWarnings("unchecked")
        Iterator<String> it = getAID().getAllAddresses();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}