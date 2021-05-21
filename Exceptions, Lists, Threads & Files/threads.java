Threads
      Java is a multi-threaded programming language. 
      This means that our program can make optimal use of available resources by running two or more components concurrently, 
      with each component handling a different task.
      You can subdivide specific operations within a single application into individual threads that all run in parallel.
      The following diagram shows the life-cycle of a thread.
        
      New Thread() ----> New --Start()--> Runnable() --run()-->
		    |				                                        |	
		   Dead        <---End of execution----         Running
		    |				                                       |
		    <-----   Waiting        <----Sleep(), wait()---  
