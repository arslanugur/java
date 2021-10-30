class TestStatic
{
    static class InnerClass
    {
        public static void InnerMethod()
        {
            System.out.println("Static Inner Class!");
        }
    }

    public static void main(String args[])
    {
        TestStatic.InnerClass.InnerMethod();
    }
}

/*
Output:
Static Inner Class!
*/
  
  
