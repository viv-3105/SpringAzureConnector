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
            }
        }
        stage('deploy') { 
            steps {
                azureWebAppPublish azureCredentialsId: env.AZURE_CRED_ID,
				resourceGroup: env.RES_GROUP, appName: env.WEB_APP, filePath: "**/springazureconnector.zip"
            }
        }
    }
}