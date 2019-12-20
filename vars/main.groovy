#!/usr/bin/groovy


def call(message){
    echo "Demo"
    echo "Testing 123" 
    echo "${message}"
    pipeline{
    stages{
     stage('Stage1'){
	steps{
        sh 'pwd'
      }
		}
	  }
	} 
      }
