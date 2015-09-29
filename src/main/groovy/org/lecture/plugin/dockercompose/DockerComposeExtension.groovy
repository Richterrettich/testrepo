package org.lecture.plugin.dockercompose

/**
 * Created by rene on 20.09.15.
 */
class DockerComposeExtension {
    def dependencies = []
    def serviceName
    def ports = []

    void addDependency(String image, String name) {
        dependencies.push(new Dependency(image,name))
    }
}
