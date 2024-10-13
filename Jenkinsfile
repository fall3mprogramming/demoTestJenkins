pipeline {
    agent any

    tools{
        maven 'apache-maven-3.9.9' // Le nom de la version de Maven que tu as configurée dans Jenkins
    }
    stages {

        stage('Construire avec Maven') {
            steps {
                // Utilisation de Maven pour compiler le projet
                bat 'mvn clean compile'
            }
        }

        stage('Exécuter les tests') {
            steps {
                // Utilisation de Maven pour exécuter les tests unitaires
                bat 'mvn test'
            }
        }

        stage('Packaging') {
            steps {
                // Utilisation de Maven pour créer un package (JAR/WAR)
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Le pipeline a réussi !'
        }
        failure {
            echo 'Le pipeline a échoué !'
        }
    }
}
