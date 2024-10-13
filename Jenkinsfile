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
                sh "git clone https://github.com/MaBouz/expi-spring.git"
            }
        }
        stage ("Generate backend image") {
            steps {
                dir("expi-spring") {
                    sh "mvn clean install"
                    sh "docker build -t docexpi-spring ."
                }
            }
        }
        stage ("Run docker compose") {
            steps {
                dir("expi-spring") {
                    sh "docker compose up -d"
                }
            }
        }
    }
}
