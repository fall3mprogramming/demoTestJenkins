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
                        junit 'target/surefire-reports/*.xml'
                    } else {
                        // Commande pour les systèmes Windows
                        bat 'mvn test'
                        junit 'target\\surefire-reports\\*.xml'
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
                         // Archiver l'artefact pour Unix
                        archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: false
                    } else {
                        // Commande pour les systèmes Windows
                        bat 'mvn package'
                         // Archiver l'artefact pour Windows
                        archiveArtifacts artifacts: 'target\\*.jar', allowEmptyArchive: false
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
