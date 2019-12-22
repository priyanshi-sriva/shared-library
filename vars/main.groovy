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
        stage('Clone') {
		steps {
	script {
	git(url: '', branch: "${BRANCH}")
 	}

      }

	}
    }
}     

 }
