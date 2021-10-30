//Pythagorean Triplet: c*c = a*a + b*b

class PythagoreanTriplet
{
    public static void main(String s[]) throws Exception
    {
        System.out.println("Pythagorean Triplet: ");
        for (int a = 1; a <= 50; a++)
        {
            for (int b = 1; b <= 50; b++)
            {
                int csquared = a * a + b * b;
                double croot = Math.sqrt(csquared);

                if (croot == Math.ceil(croot))
                {
                    System.out.println(a + " " + b + " " + (int) croot);
                }
            }
        }
    }
}

/*
Output:
Pythagorean Triplet:
3 4 5
4 3 5
5 12 13
6 8 10
7 24 25
8 6 10
8 15 17
9 12 15
9 40 41
10 24 26
12 5 13
12 9 15
12 16 20
12 35 37
14 48 50
15 8 17
15 20 25
15 36 39
16 12 20
16 30 34
18 24 30
20 15 25
20 21 29
20 48 52
21 20 29
21 28 35
24 7 25
24 10 26
24 18 30
24 32 40
24 45 51
27 36 45
28 21 35
28 45 53
30 16 34
30 40 50
32 24 40
33 44 55
35 12 37
36 15 39
36 27 45
36 48 60
40 9 41
40 30 50
40 42 58
42 40 58
44 33 55
45 24 51
45 28 53
48 14 50
48 20 52
48 36 60
*/
  

  
