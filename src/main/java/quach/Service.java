package quach;

import org.springframework.stereotype.Component;

@Component
public class Service {

    @LogExecutionTime
    public void serve() throws Exception {
        System.out.println("Begin..");
    	Thread.sleep(2000);
    	int a = 3;
    	int b = 0;
    	int c = a/b;
    	System.out.println(c);
        
    }
}
