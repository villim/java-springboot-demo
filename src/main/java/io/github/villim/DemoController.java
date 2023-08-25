package io.github.villim;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {


    @Autowired
    private Environment env;

    @GetMapping(value = "/version", produces = "application/json")
    public Version getVersion() {
        log.info("invoke getVersion method, read properties from version.properties");
        String projectVersion = env.getProperty("project.version", "");
        String gitVersion = env.getProperty("git.version", "");
        return new Version(projectVersion, gitVersion);
    }
}
