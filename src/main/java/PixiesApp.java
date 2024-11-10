import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.GameWorld;
import com.almasb.fxgl.entity.SpawnData;

public class PixiesApp extends GameApplication {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    protected void  initSettings(GameSettings settings) {
        settings.setTitle("Pixies");
        settings.setWidth(800);
        settings.setHeight(800);
        settings.setVersion("0-alpha");
    }

    @Override
    protected void initGame() {
        GameWorld world = FXGL.getGameWorld();
        world.addEntityFactory(new PixiesFactory());
        for(int i = 0; i < 100; i ++) {
            world.spawn("pixie", new SpawnData(0,0)
                    .put("flock", 0)
            );
        }
    }
}