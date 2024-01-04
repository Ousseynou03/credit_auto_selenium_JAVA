pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                echo 'Building..'
                sh "mvn clean"
            }
        }
        stage('Build') {
            steps {
                echo 'Versioning..'
                sh "mvn clean -X"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh "mvn clean install test"
            }
        }
    }
}
