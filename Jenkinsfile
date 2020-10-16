pipeline {
    agent any 
    stages {
        stage('Cleaning Stage') { 
            steps {
                bat 'mvn clean'
            }
        }
        stage('Test') { 
            steps {
                bat 'mvn test' 
            }
        }
        stage('Deploy') { 
            steps {
                bat 'mvn package'
            }
        }
    }
}