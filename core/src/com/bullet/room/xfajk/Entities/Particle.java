package com.bullet.room.xfajk.Entities;

import com.badlogic.gdx.Gdx;

public class Particle {

    public float x, y;
    public int vel_x, vel_y;
    public float size;
    
    public Particle(float x, float y, int vel_x, int vel_y,float size) {
        this.x = x;
        this.y = y;
        this.vel_x = vel_x;
        this.vel_y = vel_y;
        this.size = size;

    }

    public void Move() {
        x += vel_x * Gdx.graphics.getDeltaTime();
        y += vel_y * Gdx.graphics.getDeltaTime();
        size -= 20 * Gdx.graphics.getDeltaTime();
    }
}