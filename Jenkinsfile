pipeline{
    agent any
	
    stages {
	
	stage ('Compile Stage') {
		tools{
			jdk 'Java8'
				
		}
	    	steps{

	    		withMaven(maven : 'maven_3_6_3'){
	    			bat 'mvn clean install -s settings.xml'
				//sh label: '', script: 'mvn clean install package -s settings.xml'
	    		}
	    	}
	    }
    
	    stage ('testing Stage') {
		    
		tools{
			jdk 'Java8'
				
		}
	    	steps{
	    		withMaven(maven : 'maven_3_6_3'){
	    			bat 'mvn test -s settings.xml'
				//sh label: '', script: 'mvn test -s settings.xml'
	    		}
	    	}
	    }
	    
	    stage ('Cucumber Reports') {
	    
		tools{
			jdk 'Java8'
				
		}
	    	 steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "target/cucumber.json",
                    jsonReportDirectory: 'target'

            }
	    }
    	
    }
 
}
