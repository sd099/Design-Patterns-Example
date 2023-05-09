package org.example.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class ScienceStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubject() {
        List<String> subs = new ArrayList<>();
        subs.add("physics");
        subs.add("chemistry");
        subs.add("maths");
        subs.add("biology");
        this.subs = subs;
        return this;
    }
}
