package org.example.testpexesostuff;

import javafx.scene.control.Button;

import java.util.ArrayList;

public class Card {
    private int id;
    private Button button;
    private boolean isCardEqual = false;
    public Card(int id) {
        this.id = id;
        this.button = new Button("Karta");
        this.button.setMinSize(80,80);
    }

    public void flip() {
        button.setText(String.valueOf(id));
    }
    public void flipBack() {
        button.setText("Karta");
    }

    public Button getButton() {
        return button;
    }

    public boolean getIsCardEqual() {
        return isCardEqual;
    }

    public void setIsCardEqual(Card card) {
        if (this.id == card.id){
            this.isCardEqual = true;
        }
        this.isCardEqual = false;
    }
}

