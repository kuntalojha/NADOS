#include<iostream>
using namespace std;

int main()
{
  int a=0, b=1, c=0,n=0;
  cin>>n;
  for (int i = 0; i <n; i++)
  {
    cout<<c<<endl;
    c=a+b;
    b=a;
    a=c;
  }
}