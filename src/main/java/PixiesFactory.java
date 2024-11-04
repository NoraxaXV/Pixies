import com.almasb.fxgl.entity.*;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import com.almasb.fxgl.dsl.FXGL;

public class PixiesFactory implements EntityFactory {
    @Spawns("pixie")
    public Entity newPixie(SpawnData data) {
        return FXGL.entityBuilder()
                .type(EntityType.PIXIE)
                .from(data)
                .view(new Circle(
                        0, 0, 5, Color.BLUE)
                )
                .with(new PixieComponent(
                        data.get("flock"))
                )
                .build();
    }

    @Spawns("grid")
    public Entity newGrid(SpawnData data) {
        return FXGL.entityBuilder()
                .type(EntityType.GRID)
                .from(data)
                .build();
    }
}
