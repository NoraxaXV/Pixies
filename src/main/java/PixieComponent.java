import com.almasb.fxgl.core.math.FXGLMath;
import com.almasb.fxgl.core.math.Vec2;
import com.almasb.fxgl.entity.component.Component;

public class PixieComponent extends Component {
    private Vec2 m_velocity;
    private int m_flockId;

    public IPixieObstacle[] obstacles;

    public PixieComponent(int flockId) {
        m_velocity = new Vec2(FXGLMath.random(-5,5), FXGLMath.random(-5,5));
        m_flockId = flockId;
    }

    @Override
    public void onUpdate(double delta) {
        entity.translate(m_velocity);
        double x = entity.getX();
        double y = entity.getY();
        while(x < 0)
            x += WORLD_WIDTH;
        while(x >)
        // Wrap around world
        if(entity.getX() < 0) {
            entity.setX();
        }
    }
}
