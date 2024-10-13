pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage ("Clean up") {
            steps {
                deleteDir()
            }
        }
        stage ("Clone repo") {
            steps {
                sh "git clone https://github.com/walid090/ex1SpringDocker.git"
            }
        }
         stage('Check Directory Structure') {
            steps {
                // List the contents of the current workspace to see all files
                sh 'ls -la'
            }
        }
        stage ("Generate backend image") {
            steps {
                dir("ex1SpringDocker") {
                    sh "mvn clean install"
                    sh "docker build -t docexpi-spring ."
                }
            }
        }
        stage ("Run docker compose") {
            steps {
                dir("ex1SpringDocker") {
                    sh "docker-compose up -d"
                }
            }
        }
    }
}
