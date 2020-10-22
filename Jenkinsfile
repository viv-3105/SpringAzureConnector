node {
    def app

    stage('Clone repository') {
        checkout scm
    }

    stage('Build image') {
        bat 'mvn clean package'
        app = docker.build("connectorregistory.azurecr.io/spring-azure-connector-new")
		echo 'build done..'
    }

}