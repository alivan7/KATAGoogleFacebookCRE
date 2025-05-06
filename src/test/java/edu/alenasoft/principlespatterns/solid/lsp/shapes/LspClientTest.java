package edu.alenasoft.principlespatterns.solid.lsp.shapes;

import org.junit.jupiter.api.Test;

class LspClientTest {

    @Test
    void executeRectangle() {
        LspClient lspClient = new LspClient();
        lspClient.execute();
    }
}
