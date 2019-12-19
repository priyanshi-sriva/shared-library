#!/usr/bin/env groovy

def call(Map config){
    echo "Demo"
    pipeline {
    agent none
    stages {
        stage('test') {
            agent{
                    label 'master'
            }
            steps {
                sh 'ls'
		sh 'pwd'
            }
        }
    }
}
return this    
}
