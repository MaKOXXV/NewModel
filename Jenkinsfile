pipeline{
    agent any
	
    stages {
	
	stage ('Compile Stage') {
		tools{
			jdk 'Java8'
				
		}
	    	steps{

	    		withMaven(maven : 'maven_3_6_3'){
				try{
	    				sh 'mvn clean install'
				}
				try{
	    				bat 'mvn clean install -s settings.xml'
				}
				catch(err) {
  					echo 'command fail'
				}
				
	    		}
	    	}
	    }
    
	    stage ('testing Stage') {
		    
		tools{
			jdk 'Java8'
				
		}
	    	steps{
	    		withMaven(maven : 'maven_3_6_3'){			
				try{
	    				sh 'mvn mvn -X test'
				}
				try{
	    				bat 'mvn mvn -X test -s settings.xml'
				}
				catch(err) {
  					echo 'command fail'
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
