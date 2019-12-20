#!/usr/bin/env groovy

def call(){
    echo "Demo"
    pipeline {
    agent none
    stages {
        stage('test')
            steps {
		sh 'pwd'
            }
        }
    }
}
return this    
}
