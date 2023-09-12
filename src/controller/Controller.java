package controller;

import view.ConsoleUI;
import view.UI;

/**
 * Place here class purpose.
 *
 * @author Kirill
 * @since 12.09.2023
 */
public class Controller {
    private UI ui;

    public Controller() {
        ui = new ConsoleUI();
    }

    public void playGame() {
        ui.greetUser();
    }
}
