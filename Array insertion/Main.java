#include<iostream>

using namespace std;

int main()

{
int arr[20];
int n, loc, val;
std::cout<<"Enter the number of elements in the array\n";
std::cin>>n;
std::cout<<"Enter the elements in the array\n";
for(int i=0; i<n; i++)
{
std::cin>>arr[i];
}
std::cout<<"Enter the location where you wish to insert an element\n";
std::cin>>loc;
if(loc>n || loc<=0)
{
std::cout<<"Invalid Input";
}
else
{
std::cout<<"Enter the value to insert\n";
std::cin>>val;
for(int i=n-1; i>=loc-1; i--)
{
arr[i+1] = arr[i];
}
arr[loc-1] = val;
std::cout<<"Array after insertion is\n";
for(int i=0; i<=n; i++)
{
std::cout<<arr[i]<<"\n";
   }
 }
}