package com.mygdx.game.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import com.mygdx.game.Assets;

public class EndGame {
    TextureRegion texture;
    float stateTime;
    boolean finish;

    public EndGame(){
        finish = false;
    }

    public void render(SpriteBatch batch,int x) {
        batch.draw(texture, x,0);
    }

    void update(float delta, Assets assets){
        stateTime += delta;
        texture = assets.gameover.getKeyFrame(stateTime,true);
    }

}
