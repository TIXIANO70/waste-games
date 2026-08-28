package io.github.some_example_name;

import com.badlogic.gdx.Game;
import io.github.some_example_name.screens.SnakeScreen;

/**
 * Clase principal del juego que administra las pantallas activas.
 * Hereda de Game para permitir el intercambio modular de pantallas y minijuegos.
 */
public class Main extends Game {

    @Override
    public void create() {
        // Establece la pantalla inicial del minijuego Snake
        this.setScreen(new SnakeScreen(this));
    }

    @Override
    public void render() {
        // Delega el ciclo de renderizado a la pantalla activa actual
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}

