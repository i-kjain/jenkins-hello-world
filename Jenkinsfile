pipeline {
    agent any
    tools {
        jdk 'java21'
    }
    stages {
        stage('Checkout') {
            steps {
                echo 'Pulling code from GitHub...'
            }
        }
        stage('Compile') {
            steps {
                // This compiles your Java file
                sh 'javac HelloWorld.java'
            }
        }
        stage('Run') {
            steps {
                // This runs the compiled class
                sh 'java HelloWorld'
            }
        }
    }
    post {
        success {
            echo 'Assignment Complete: The code compiled and ran successfully!'
        }
    }
}
