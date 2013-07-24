DynamicProxy
============
Follow these steps to get this running:    
1) Unzip the zip file     
2) Make sure you have 'ant' on your path     
3) Run 'ant Test'    
4) You will see couple of statements printed that look like this:     
    
Test:     
     [java] Executing method = [method1], args = [[test1, test2]]    
     [java] Executed method = [method1], Output = [test1test2method1]     
     [java] Executing method = [method1], args = [[test3, test4]]    
     [java] Executed method = [method1], Output = [test3test4method1]    
    
5) These are all coming from the invoke method in Proxy class.    
6) You can modify the invoke method in Proxy class to do more than just logging the inputs and outputs.    
7) Happy Proxying!!     
   
