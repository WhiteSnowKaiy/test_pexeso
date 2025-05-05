package org.example.testpexesostuff;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Collections;

public class HelloController {
    @FXML
    private GridPane gridForCards;
    ArrayList<Card> cards = new ArrayList<>();

    @FXML
    void initialize() {
        int id = 0;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 2; j++){
                System.out.println(id);
                cards.add(new Card(id));
                cards.add(new Card(id));
                id++;
            }
        }
        Collections.shuffle(cards);
        displayCards();
    }

    private void displayCards() {
        gridForCards.getChildren().clear();
        int index = 0;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                Card card = cards.get(index++);
                Button btn = card.getButton();
                btn.setOnAction(e -> handleCardClick(card));
                gridForCards.add(btn, col, row);
            }
        }
    }

    private void handleCardClick(Card card) {
        card.flip();
        card.getIsCardEqual();
        // card.flipBack(); - Uncomment this to switch back after logic happens
    }
}