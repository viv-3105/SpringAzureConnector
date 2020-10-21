pipeline {
    agent any 
    stages {
        stage('init') { 
            steps {
                checkout scm
            }
        }
        stage('build') { 
            steps {
                bat 'mvn clean package'
				bat 'docker build -f PATH/Dockerfile -t spring-azure-connector-new .x'
		    }
        }
        stage('deploy') { 
            steps {
                bat 'docker login connectorregistory.azurecr.io'
				bat 'docker tag spring-azure-connector-new connectorregistory.azurecr.io/spring-azure-connector-new:v1'
				bat 'docker push connectorregistory.azurecr.io/spring-azure-connector-new:v1'
            }
        }
    }
}