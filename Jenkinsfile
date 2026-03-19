pipeline {
    agent any
    tools {
        jdk 'java21' // This matches the name you gave in Tools!
    }
    stages {
        stage('Checkout') {
            steps {
                echo 'Pulling code from GitHub...'
            }
        }
        stage('Compile') {
            steps {
                sh 'javac HelloWorld.java'
            }
        }
        stage('Run & Test') {
            steps {
                sh 'java HelloWorld'
            }
        }
    }
    post {
        success {
            echo 'Assignment Complete: The code compiled and ran 
successfully!'
        }
    }
}
