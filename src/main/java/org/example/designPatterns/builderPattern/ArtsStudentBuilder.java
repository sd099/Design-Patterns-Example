package org.example.designPatterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class ArtsStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubject() {
        List<String> subs = new ArrayList<>();
        subs.add("economics");
        subs.add("history");
        subs.add("political science");
        subs.add("geography");
        this.subs = subs;
        return this;
    }
}
