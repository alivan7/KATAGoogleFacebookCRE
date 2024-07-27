package edu.alenasoft.principlespatterns.patterns.composite;

import org.junit.jupiter.api.Test;

class FileExplorerAppTest {

    @Test
    void execute() {
        var app = new FileExplorerApp();

        app.print();
    }
}
