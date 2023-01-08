package com.bullet.room.xfajk.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;
import com.bullet.room.xfajk.BulletRoom;

public class GameScreen implements Screen {

    final BulletRoom game;

    private OrthographicCamera camera;


    public GameScreen(BulletRoom game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false,800.0f,600.0f);


    }
    
    @Override
    public void render(float delta) {

        ScreenUtils.clear(0,0,0,1);
        camera.update();

        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();



        game.font.draw(game.batch, "FPS: "+Gdx.graphics.getFramesPerSecond(), 2,600);
        game.batch.end();


      
 
    }

    public void dispose() {
        
    }

    public void resize(int width, int height) {}

    public void pause() {}

    public void show() {}

    public void resume() {}

    public void hide() {}

}
