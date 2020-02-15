package com.example.rule.editor.model;

import java.util.Objects;

public class AttributeDef {

    private final String name;
    private final Class<?> type;

    public AttributeDef(String name, Class<?> type) {
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    public String getName() {
        return name;
    }

    public Class<?> getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        AttributeDef that = (AttributeDef) o;
        if (!name.equals(that.name)) {
            return false;
        }
        return type.equals(that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
