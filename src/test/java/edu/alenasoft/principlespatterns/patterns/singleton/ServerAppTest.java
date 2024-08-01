package edu.alenasoft.principlespatterns.patterns.singleton;

import org.junit.jupiter.api.Test;

class ServerAppTest {

    @Test
    void serverApp() {
        var app = new ServerApp();

        app.run();
    }
}
