package org.foo

class MavenBuildUtils implements Serializable {
    def steps

    MavenBuildUtils(steps) {
        this.steps = steps
    }

    def runMavenBuild() {
        steps.echo "Running Maven Build..."
        steps.sh "mvn clean install"
    }

    def runMavenTest() {
        steps.echo "Running Maven Tests..."
        steps.sh "mvn test"
    }
}
