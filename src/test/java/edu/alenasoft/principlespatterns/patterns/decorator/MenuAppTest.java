package edu.alenasoft.principlespatterns.patterns.decorator;

import org.junit.jupiter.api.Test;

class MenuAppTest {

    @Test
    void showMenu() {
        var app = new MenuApp();

        app.showMenu();
    }
}
