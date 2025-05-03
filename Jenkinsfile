@Library('shared_lib') _

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test with Shared Library') {
            steps {
                mavenBuild()
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution completed.'
        }
    }
}
