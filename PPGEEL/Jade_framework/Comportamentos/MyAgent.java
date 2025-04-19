import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class MyAgent extends Agent {

    protected void setup() {
        System.out.println("Hello World! I am an agent.");
        System.out.println("Estou disparando meu comportamento... ");
        addBehaviour(new MyBehavior(this));

    }

}
