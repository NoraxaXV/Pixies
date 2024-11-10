import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.component.Component;

public class Simulation extends Component {
    private static class SimulationSingleton {
    }
    public Simulation getInstance() {
    }

    private static Simulation m_instance = null;
    private Simulation() {
    }
}
