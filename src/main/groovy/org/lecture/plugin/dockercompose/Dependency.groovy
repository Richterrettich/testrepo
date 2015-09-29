package org.lecture.plugin.dockercompose

/**
 * Created by rene on 20.09.15.
 */
class Dependency {
    String name,image

    Dependency(name,image) {
        this.name = name;
        this.image = image;
    }
}
