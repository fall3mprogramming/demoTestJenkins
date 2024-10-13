pipeline {
    agent any

    tools {
        maven 'apache-maven-3.9.9' // Le nom de la version de Maven que tu as configurée dans Jenkins
    }

    stages {
        stage('Construire avec Maven') {
            steps {
                script {
                    if (isUnix()) {
                        // Commande pour les systèmes Unix
                        sh 'mvn clean compile'
                    } else {
                        // Commande pour les systèmes Windows
                        bat 'mvn clean compile'
                    }
                }
            }
        }

        stage('Exécuter les tests') {
            steps {
                script {
                    if (isUnix()) {
                        // Commande pour les systèmes Unix
                        sh 'mvn test'
                    } else {
                        // Commande pour les systèmes Windows
                        bat 'mvn test'
                    }
                }
            }
        }

        stage('Packaging') {
            steps {
                script {
                    if (isUnix()) {
                        // Commande pour les systèmes Unix
                        sh 'mvn package'
                    } else {
                        // Commande pour les systèmes Windows
                        bat 'mvn package'
                    }
                }
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
