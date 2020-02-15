pipeline{
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
            steps {
                docker.withRegistry('https://registry.hub.docker.com', 'docker_hub') {
                            def app = docker.build("chaminda202/dockerwebapp")
                            app.push("latest")
                 }
            }
        }
    }
}
