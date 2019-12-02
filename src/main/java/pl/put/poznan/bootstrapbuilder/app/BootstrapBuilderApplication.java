package pl.put.poznan.bootstrapbuilder.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"pl.put.poznan.bootstrapbuilder.rest"})

/**
* <h1>Bootstrap Builder Application</h1>
*
* An application for web programmers 
* who want to quickly create an application framework 
* with Bootstrap 4 framework support. 
* A program that allows you to restore the page code
* with a header, footer, as well as appropriate META tags 
* in the context of ordinary SEO, Open Graph and Twitter.
*
* @author  IO
* @version 1.0
* @since   2019-12-01
*/

public class BootstrapBuilderApplication {
	
	/** 
    * This is the main method  
    * which is very important for  
    * execution for a java program.
    * @param args Unused.
    * @return Nothing.
    */
	
    public static void main(String[] args) {
		
        SpringApplication.run(BootstrapBuilderApplication.class, args);
    }
}
