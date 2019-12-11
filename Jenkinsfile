pipeline{
    agent any
	
    stages {
	
	stage ('Compile Stage') {
		tools{
			jdk 'Java8'
				
		}
	    	steps{

	    		withMaven(maven : 'maven3.6'){
	    			sh 'mvn clean install'
				//sh label: '', script: 'mvn clean install package -s settings.xml'
	    		}
	    	}
	    }
    
	    stage ('testing Stage') {
		    
		tools{
			jdk 'Java8'
				
		}
	    	steps{
	    		withMaven(maven : 'maven3.6'){
	    			sh 'mvn -X test'
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
