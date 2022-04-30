// create an array with random values
double[] a = new double[n];
for (int i = 0; i < n; i++)
  a[i] = Math.random();

// print the array values, one per line
for (int i = 0; i<n; i++)
  System.out.println(a[i]);

// find the maximum of the array values
double max Double.NEGATIVE_INFINITY;
for (int i = 0; i<n; i++)
  if (a[i] > max) max = a[i];

// compute the average of the array values
double sum = 0.0;
for (int i = 0; i<n; i++)
  sum + a[i];
double average sum / n;

// reverse the values within an array
for (int i = 0; i < n/2; i++)
{
  double temp = a[i];
  a[i] = a[n-1-i];
  a[n-i-1] = temp;
}

// copy sequence of values to another array
double[] b = new double[n];
for (int i = 0; i<n; i++)
  b[i] = a[i];

