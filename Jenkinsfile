pipeline{
	agent any
	tools{
		maven "maven_3.6.3"
		}
	stages{
		stage("Fetching Code from Git"){
			steps{
				git branch: 'master', url: 'https://github.com/saba8683/limitservice.git'
			}
		}
		stage("Building Artifact"){
			steps{
				sh "mvn clean package"
			}
		}
	}
}
