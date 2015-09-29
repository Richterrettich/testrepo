package org.lecture.plugin.dockercompose;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by rene on 20.09.15.
 */
public class DockerComposePlugin implements Plugin<Project> {

  @Override
  public void apply(Project project) {
    project.extensions.create("compose",DockerComposeExtension);

    project.compose.serviceName = project.name
  }

}
