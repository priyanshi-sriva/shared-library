#!/usr/bin/groovy


def call(message){
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

     }
   }
    }
