#include<iostream>

using namespace std;

int main()

{

int r,c;

std::cin>>r>>c;

int i,j;
int Arr[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
std::cin>>Arr[i][j];
}
}
int Max=Arr[0][0];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(Max<Arr[i][j])
{
Max=Arr[i][j];
}
  }
}
std::cout<<"The maximum element is "<<Max;
return 0;
}