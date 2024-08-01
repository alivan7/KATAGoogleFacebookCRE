package edu.alenasoft.principlespatterns.patterns.factory;

import org.junit.jupiter.api.Test;

class GildedAppTest {

    @Test
    void gildedApp() {
        var app = new GildedApp();

        app.run();
    }
}
