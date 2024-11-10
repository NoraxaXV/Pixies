import com.almasb.fxgl.core.math.FXGLMath;
import com.almasb.fxgl.core.math.Vec2;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.component.Component;

import java.util.ArrayList;

public class PixieComponent extends Component {
    private Vec2 m_velocity;

    private int m_flockId;
    public IPixieObstacle[] obstacles;

    public PixieComponent(int flockId) {
        m_velocity = new Vec2(FXGLMath.random(-10,10), FXGLMath.random(-10,10));
        m_flockId = flockId;
    }

    @Override
    public void onUpdate(double delta) {
        entity.translate(m_velocity.mul(delta));

        // Wrap the position around the world boundaries
        int width = FXGL.getAppWidth();
        int height = FXGL.getAppHeight();
        entity.translate(
                -width * Math.floor(entity.getX() / width),
                -height * Math.floor(entity.getY() / height)
        );
    }
}
