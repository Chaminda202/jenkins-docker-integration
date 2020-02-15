pipeline{
    def app
    agent any
    tools {
        maven 'Maven-3.6.3' 
    }
    stages {
        stage('Dev stage') {
            steps {
                     bat 'mvn clean install'
            }
        }
        stage('Qa stage') {
            steps {
                     bat 'mvn clean install'
            }
        }
        stage('Prod stage') {
            docker.withRegistry('https://registry.hub.docker.com', 'docker_hub') {
                        app.push("${env.BUILD_NUMBER}")
                        app.push("latest")
                    }
        }
    }
}
