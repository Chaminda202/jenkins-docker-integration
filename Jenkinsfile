Pipeline{
    agent any
    stages {
        stage('Dev stage') {
            steps{
                withMaven(maven: 'Maven-3.6.3') {
                     bat 'mvn clean install'
                }
            }
        }
        stage('Qa stage') {
            steps{
                withMaven(maven: 'Maven-3.6.3') {
                     bat 'mvn clean test'
                }
            }
        }
        stage('Prod stage') {
            steps{
                withMaven(maven: 'Maven-3.6.3') {
                    bat 'mvn clean test'
                }
            }
        }
    }
}