/***********************************************************************
* Program:
*    Test 4.1, Practice Test 1
*    Brother Falin, CS124
* Author:
*    Joseph Walker
* Summary:
*    
*
*    Estimated:  0.0 hrs
*    Actual:     0.0 hrs
*      Please describe briefly what was the most difficult part.
************************************************************************/
#include <cstdlib> 
#include <iostream>
#include <string>
#include <ctype.h>
using namespace std;

int countDigits(int argc, char *argv[]);

/**********************************************************************
 * main
 * 
 * 
 * 
 ***********************************************************************/
int main(int argc, char *argv[])
{
	cout.setf(ios::showpoint);
	cout.setf(ios::fixed);
	cout.precision(1);
	
	
	int count = countDigits(argc, argv);
	cout << count;
	/*// run through every arg value and convert it to meeters;
	for (int i = 1; i < argc; i++)
	{
		// convert the value to a float and store it
		int feet = atof(argv[i]);
		float meters = convertFeetToMeters(feet);
		
		cout << feet << " feet is " << meters << endl;
	}*/
}

/**********************************************************************
 * convert feet to meters
 * Will convert and return the value of feet to meters.
 ***********************************************************************/
int countDigits(int argc, char *argv[])
{
	int count = 0;
	for (int i = 1; i < argc; i++)
	{
		if (isdigit(argv[i]))
		{
			count++;
		}
	}
	return count;
}
