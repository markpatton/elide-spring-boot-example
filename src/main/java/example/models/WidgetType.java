package example.models;

import java.util.Arrays;

public enum WidgetType {
    GOOD("good-one"), BAD("bad-one");

    private String value;

    WidgetType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
