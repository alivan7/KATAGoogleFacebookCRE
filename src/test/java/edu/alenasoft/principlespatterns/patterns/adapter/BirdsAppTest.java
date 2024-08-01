package edu.alenasoft.principlespatterns.patterns.adapter;

import org.junit.jupiter.api.Test;

class BirdsAppTest {

    @Test
    void birds() {
        var app = new BirdsApp();

        app.play();
    }
}
