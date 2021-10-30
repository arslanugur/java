class Animal
{
}

//Dog inherits Animal  
class Dog1 extends Animal
{
    public static void main(String args[])
    {
        Dog1 d = new Dog1();

        System.out.println("d is instanceof Animal: ");

        System.out.println(d instanceof Animal);//true  
    }
}

/*
Output:
d is instanceof Animal: 
true
*/

