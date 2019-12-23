#!/usr/bin/groovy


def call(message){
    echo "Demo"
    echo "Testing 123" 
    echo "${message}"
    pipeline {
    agent any
    stages {
        stage('No-op') {
            #agent{
            #        label 'master'
            #}
            steps {
                sh 'ls'
            }
        }
	stages{
        stage("git pull"){
            steps{
                script{
                    git branch: "master", changelog: false, url: "https://github.com/ankurbhatt04/spring-boot-rest-example" 
                }   
            }
        }
        stage("maven"){
            steps{
                script{
                    withMaven (maven: "mavenTool")
                    {
                    sh(script:"""
                    mvn clean package
                    """)
                    }
                }
            }
        }

     }
   }
    }
