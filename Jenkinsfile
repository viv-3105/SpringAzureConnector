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
                sh '''
					mvn clean package
					cd target
					cp ../src/main/resources/web.config web.config
					cp SpringAzureConnector-0.0.1-SNAPSHOT.jar app.jar 
					zip springAzureConnector.zip app.jar web.config
					'''
            }
        }
        stage('deploy') { 
            steps {
                azureWebAppPublish azureCredentialsId: env.AZURE_CRED_ID,
				resourceGroup: env.RES_GROUP, appName: env.WEB_APP, filePath: "**/springAzureConnector.zip"
            }
        }
    }
}