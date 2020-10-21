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
				def testImage = docker.build("spring-azure-connector-new", "./dockerfiles/spring-azure-connector-new") 

				testImage.inside {
					sh 'make test'
				}
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