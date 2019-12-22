#!/usr/bin/groovy


def call(message,BRANCH){
    echo "Demo"
    echo "Testing 123" 
    echo "${message}"
    pipeline {
    agent none
    stages {
        stage('No-op') {
            agent{
                    label 'master'
            }
            steps {
                sh 'ls'
            }
        }
	stage('clone') {
	steps {
script {
git(url: 'git@github.com:priyanshi-sriva/shared-library.git', branch: "${BRANCH}")
   }

     }
   }
    }
}     

 }
