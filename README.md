# spring-boot-producing-soap-ws
[![Build Status](https://dev.azure.com/prateepgedupudi/AzureDevOpsProject/_apis/build/status/prateepgedupudi.spring-boot-producing-soap-ws)](https://dev.azure.com/prateepgedupudi/AzureDevOpsProject/_build/latest?definitionId=1)
## Create an XML schema to define the domain
## Generate domain classes based on an XML schema
Generate domain classes with the below maven plugin.
```
<plugin>
	<groupId>org.codehaus.mojo</groupId>
	<artifactId>jaxb2-maven-plugin</artifactId>
	<version>1.6</version>
	<executions>
		<execution>
			<id>xjc</id>
			<goals>
				<goal>xjc</goal>
			</goals>
		</execution>
	</executions>
	<configuration>
		<schemaDirectory>${project.basedir}/src/main/resources/</schemaDirectory>
		<outputDirectory>${project.basedir}/src/main/java</outputDirectory>
		<clearOutputDir>false</clearOutputDir>
	</configuration>
</plugin>
```
## Create repository
## Create service endpoint
## Configure web service beans
## Make the application executable
## wsdl end point
https://pg-produce-spring-boot-soap-ws.herokuapp.com/ws/states.wsdl
