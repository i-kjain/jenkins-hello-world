pipeline {
    agent any

    stages {

        stage('Clone Code') {
            steps {
                git 'https://github.com/i-kjain/jenkins-hello-world.git'
            }
        }

        stage('Build') {
            steps {
                sh 'javac HelloWorld.java TestHello.java'
            }
        }

        stage('Test') {
            steps {
                sh 'java TestHello'
            }
        }

        stage('Deploy') {
            steps {
                sh 'java HelloWorld'
            }
        }
    }
}





// pipeline {
//     agent any
//     tools {
//         jdk 'java21'
//     }
//     stages {
//         stage('Checkout') {
//             steps {
//                 echo 'Pulling code from GitHub...'
//             }
//         }
//         stage('Compile') {
//             steps {
//                 // This compiles your Java file
//                 sh 'javac HelloWorld.java'
//             }
//         }
//         stage('Run') {
//             steps {
//                 // This runs the compiled class
//                 sh 'java HelloWorld'
//             }
//         }
//     }
//     post {
//         success {
//             echo 'Assignment Complete: The code compiled and ran successfully!'
//         }
//     }
// }
