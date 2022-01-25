package com.vaca.glx17;


import com.vaca.glx17.glkit.ShaderProgram;

/**
 * Created by burt on 2016. 6. 23..
 */
public class Cube extends Model {

    static final float vertices[] = {
            // Front
             1, -1, 1,      1, 0, 0, 1,     1, 0,   0, 0, 1, // 0
             1,  1, 1,      0, 1, 0, 1,     1, 1,   0, 0, 1, // 1
            -1,  1, 1,      0, 0, 1, 1,     0, 1,   0, 0, 1, // 2
            -1, -1, 1,      0, 0, 0, 1,     0, 0,   0, 0, 1, // 3

            // Back
            -1, -1, -1,     0, 0, 1, 1,     1, 0,   0, 0,-1, // 4
            -1,  1, -1,     0, 1, 0, 1,     1, 1,   0, 0,-1, // 5
             1,  1, -1,     1, 0, 0, 1,     0, 1,   0, 0,-1, // 6
             1, -1, -1,     0, 0, 0, 1,     0, 0,   0, 0,-1, // 7

            // Left
            -1, -1,  1,     1, 0, 0, 1,     1, 0,  -1, 0, 0, // 8
            -1,  1,  1,     0, 1, 0, 1,     1, 1,  -1, 0, 0, // 9
            -1,  1, -1,     0, 0, 1, 1,     0, 1,  -1, 0, 0, // 10
            -1, -1, -1,     0, 0, 0, 1,     0, 0,  -1, 0, 0, // 11

            // Right
             1, -1, -1,     1, 0, 0, 1,     1, 0,   1, 0, 0, // 12
             1,  1, -1,     0, 1, 0, 1,     1, 1,   1, 0, 0, // 13
             1,  1,  1,     0, 0, 1, 1,     0, 1,   1, 0, 0, // 14
             1, -1,  1,     0, 0, 0, 1,     0, 0,   1, 0, 0, // 15

            // Top
             1, 1,  1,      1, 0, 0, 1,     1, 0,   0, 1, 0, // 16
             1, 1, -1,      0, 1, 0, 1,     1, 1,   0, 1, 0, // 17
            -1, 1, -1,      0, 0, 1, 1,     0, 1,   0, 1, 0, // 18
            -1, 1,  1,      0, 0, 0, 1,     0, 0,   0, 1, 0, // 19

            // Bottom
             1, -1, -1,     1, 0, 0, 1,     1, 0,   0,-1, 0, // 20
             1, -1,  1,     0, 1, 0, 1,     1, 1,   0,-1, 0, // 21
            -1, -1,  1,     0, 0, 1, 1,     0, 1,   0,-1, 0, // 22
            -1, -1, -1,     0, 0, 0, 1,     0, 0,   0,-1, 0, // 23

    };

    static final short indices[] = {

            // Front
            0, 1, 2,
            2, 3, 0,

            // Back
            4, 5, 6,
            6, 7, 4,

            // Left
            8, 9, 10,
            10, 11, 8,

            // Right
            12, 13, 14,
            14, 15, 12,

            // Top
            16, 17, 18,
            18, 19, 16,

            // Bottom
            20, 21, 22,
            22, 23, 20
    };

    public Cube(ShaderProgram shader) {
        super("cube", shader, vertices, indices);
    }

    @Override
    void injectData(ShaderProgram shader) {
        shader.setUniformf("u_Light.Color", 1.0f, 1.0f, 1.0f);
        shader.setUniformf("u_Light.AmbientIntensity", 0.1f);
        shader.setUniformf("u_Light.DiffuseIntensity", 0.7f);
        shader.setUniformf("u_Light.Direction", 0.0f, 1.0f, -1.0f);
        shader.setUniformf("u_Light.SpecularIntensity", 2.0f);
        shader.setUniformf("u_Light.Shininess", 10.0f);
    }
}
