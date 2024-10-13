pipeline {
    agent any

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
