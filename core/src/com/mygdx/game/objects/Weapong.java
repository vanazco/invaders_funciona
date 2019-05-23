package com.mygdx.game.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Assets;

public class Weapong {
    TextureRegion texture;
    float stateTime;
    Vector2 position;

    boolean death;

    public Weapong(int x){
        position = new Vector2(x,0);
        death = false;
    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x, position.y);
    }

    void update(float delta, Assets assets){
        stateTime += delta;
        texture = assets.weapong.getKeyFrame(stateTime,true);
    }

    public void remove(){
        death = true;
    }

}
