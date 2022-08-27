#include <iostream>
using namespace std;

int main()
{
  int x,count=0;
  cin>>x;
  
  for(;x>0;x=x/10){
    count++;
  }
  cout<<count;
}