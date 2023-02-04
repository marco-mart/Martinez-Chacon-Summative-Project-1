package com.company.MartinezChaconSummativeProject1.models;

import java.util.Objects;

public class Definition
{
    private int id;
    private String word;
    private String definition;

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Definition definition1 = (Definition) o;
        return id == definition1.id && Objects.equals(word, definition1.word) && Objects.equals(definition, definition1.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, word, definition);
    }
}
