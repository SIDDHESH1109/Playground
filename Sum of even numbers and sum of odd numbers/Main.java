#include <iostream>

using namespace std;

int main()

{

int size;

std::cin>>size;

int i, num[15];

int oddSum=0,evenSum=0;

for(i=0;i<size;i++)

std::cin>>num[i];

for(i=0; i<size; i++)

{

if(num[i]%2==0)

evenSum=evenSum+num[i];

else

oddSum=oddSum+num[i];

}

std::cout<<"The sum of the even numbers in the array is "<< evenSum;

std::cout<<"\nThe sum of the odd numbers in the array is "<<oddSum;
return 0;
}