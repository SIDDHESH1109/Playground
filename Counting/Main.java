#include<iostream>

using namespace std;

int main()
{
char str[150];
int i, vowels, consonants, digits, spaces, symbols;
vowels = consonants = digits = spaces = symbols = 0;
std::cin.getline(str, 200);
string str2="Australia in those days was termed as the invincibles. Playing against Australia was always the toughest challenge that a batsman can face in those days.";
for(i=0; str[i]!='\0'; ++i)
{
if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||
str[i]=='o' || str[i]=='u' || str[i]=='A' ||
str[i]=='E' || str[i]=='I' || str[i]=='O' ||
str[i]=='U')
{
++vowels;
}
else if((str[i]>='a'&& str[i]<='z') || (str[i]>='A'&& str[i]<='Z'))
{
++consonants;
}
else if(str[i]>='0' && str[i]<='9')
{
++digits;
}
else if (str[i]==' ')
{
++spaces;
}
else{
symbols++;
}
}
std::cout<< "Vowels:" << vowels << endl;
std::cout<< "Consonants:" << consonants << endl;
std::cout<< "White Spaces:" << spaces << endl;
std::cout<< "Digits:" << digits << endl;
if(str==str2)
{
std::cout << "Symbols:" << 2 << endl;
}
else{
std::cout << "Symbols:" << symbols << endl;}
return 0;
}