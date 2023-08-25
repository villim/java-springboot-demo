package io.github.villim;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Version {

    String projectVersion;

    String gitRevision;

    @Override
    public String toString() {
        return "Project Version=[" + projectVersion + "], Git Revision=[" + gitRevision + "]";
    }
}
