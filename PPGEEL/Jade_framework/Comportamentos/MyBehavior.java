import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class MyBehavior extends Behaviour {
    private int step = 0;

    public MyBehavior(Agent a) {
        super(a);
    }

    public void action() {
        System.out.println("Olá Mundo! ... Meu nome é " + myAgent.getLocalName());
        step++;
    }

    public boolean done() {
        // caso este método retorne true o comportamento será finalizado.
        return step > 3;
    }

}
