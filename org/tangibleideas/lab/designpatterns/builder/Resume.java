package org.tangibleideas.lab.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Resume {

    private String name;
    private String email;
    private String summary;
    private List<String> experiences = null;

    public Resume() {
    }

    @Override
    public String toString() {
        return String.format(""" 
                === RESUME START ===
                Name: %s
                Email: %s
                Summary: %s
                Experiences: %s
                === RESUME END ===
                """, name, email, summary, experiences);
    }

    public static class Builder {

        private String name = "Nameless";
        private String email = "default@nodomain.com";
        private String summary = "Impressive Summary";
        private final List<String> experiences = new ArrayList<>();

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public Builder addExperience(String experience) {
            this.experiences.add(experience);
            return this;
        }

        public Resume build() {
            Resume r = new Resume();
            r.name = name;
            r.email = email;
            r.summary = summary;
            r.experiences = experiences;
            return r;
        }
    }
}
