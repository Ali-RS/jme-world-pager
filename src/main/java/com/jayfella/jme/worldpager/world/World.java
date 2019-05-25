package com.jayfella.jme.worldpager.world;

import com.jayfella.jme.worldpager.core.NoiseEvaluator;
import com.jayfella.jme.worldpager.grid.SceneGrid;
import com.jayfella.jme.worldpager.grid.collision.CollisionGrid;
import com.jme3.app.Application;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

import java.util.List;
import java.util.concurrent.ExecutorService;

public interface World {

    String getName();
    int getSeed();

    // LayeredNoise getNoiseGenerator();
    NoiseEvaluator getWorldNoise();
    void setWorldNoise(NoiseEvaluator noiseEvaluator);
    ExecutorService getThreadPool();

    Material getRegisteredMaterial(String key);
    void registerMaterial(String key, Material material);

    List<SceneGrid> getSceneGrids();
    SceneGrid getSceneGrid(String name);
    void addSceneGrid(SceneGrid sceneGrid);

    List<CollisionGrid> getCollisionGrids();
    CollisionGrid getCollisionGrid(String name);
    void addCollisionGrid(CollisionGrid collisionGrid);

    Application getApplication();

    Node getWorldNode();

    Vector3f getFollower();
    void setFollower(Vector3f vector3f);

}
