#!/usr/bin/env groovy

def call(Map config){
    echo "Testing Testing"
    echo config.company
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
return this    
}
