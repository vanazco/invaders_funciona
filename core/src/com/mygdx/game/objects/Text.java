package com.mygdx.game.objects;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Assets;

public class Text {
    BitmapFont font;
    float stateTime;

    public Text(){
        font = new BitmapFont();
    }

    public void render(SpriteBatch batch,int y) {
        font.draw(batch,"Score:", 0,y);
    }

    public void update(float delta) {
        stateTime += delta;
    }
}
