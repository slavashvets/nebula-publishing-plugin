/*
 * Copyright 2015 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nebula.plugin.publishing.maven

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.Dependency
import org.gradle.api.plugins.JavaPlugin
import org.gradle.api.plugins.WarPlugin
import org.gradle.api.publish.maven.MavenPublication

class MavenPublishingPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.plugins.apply MavenJavaPublishingPlugin
        project.plugins.apply DeveloperPomPlugin
        project.plugins.apply ManifestPomPlugin
        project.plugins.apply ResolvedMavenPlugin
        project.plugins.apply ScmPomPlugin
    }
}
