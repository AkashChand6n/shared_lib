def call() {
    def utils = new org.foo.MavenBuildUtils(this)

    stage('Build') {
        utils.runMavenBuild()
    }

    stage('Test') {
        utils.runMavenTest()
    }
}
