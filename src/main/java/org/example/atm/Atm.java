package org.example.atm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import org.example.atm.state.IAtmState;
import org.example.atm.state.IdealState;

@Data
public class Atm {
    private IAtmState currentState;
    private List<Card> cardList;
    private Card currentCard;
    private Map<NoteType, Integer> notes;
    private Integer availableAmount;

    public Atm() {
        this.currentState = new IdealState();
        this.cardList = new ArrayList<>();
        this.currentCard = null;
        this.notes = new HashMap<>();
        this.notes.put(NoteType.TWO_THOUSANDS, 0);
        this.notes.put(NoteType.FIVE_HUNDREDS, 0);
        this.notes.put(NoteType.ONE_HUNDRED, 0);
        this.availableAmount = 0;
    }

    public void addCard(Card card) {
        this.cardList.add(card);
    }

    public void addNote(NoteType noteType, Integer count) {
        this.notes.put(noteType, notes.get(noteType) + count);
        availableAmount += noteType.getNoteValue() * count;
    }

    public void deductNotes(NoteType noteType, Integer count) {
        this.notes.put(noteType, notes.get(noteType) - count);
        availableAmount -= noteType.getNoteValue() * count;
    }
}
