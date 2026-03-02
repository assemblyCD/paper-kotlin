import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar.Companion.shadowJar
import gradle.kotlin.dsl.accessors._461acbb0a98981b3b2e619ab73662b43.kotlinSourcesJar

plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            version = project.version.toString()
            artifactId = project.name

            artifact(tasks.kotlinSourcesJar.get())
            artifact(tasks.shadowJar.get())
        }
    }
}
