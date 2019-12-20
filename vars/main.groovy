#!/usr/bin/env groovy

def call(){
    echo "Demo"
    pipeline {
    stages {
        stage('test')
            steps {
		sh 'pwd'
            }
        }
    }
}
