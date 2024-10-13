pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Clean up') {
            steps {
                deleteDir()
            }
        }
        stage('Clone repo') {
            steps {
                sh 'git clone https://github.com/walid090/ex1SpringDocker.git'
            }
        }
        stage('Check Directory Structure') {
            steps {
                // This will list all the files and directories in the workspace
                sh 'ls -la'
            }
        }
        stage('Generate backend image') {
            steps {
                dir('DockerSpringEx1') { // Replace with the correct directory if necessary
                    sh 'mvn clean install'
                }
            }
        }
        stage('Run docker compose') {
            steps {
                dir('DockerSpringEx1') { // Replace with the correct directory if necessary
                    sh 'docker compose up -d'
                }
            }
        }
    }
}
