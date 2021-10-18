#include <bits/stdc++.h>
using namespace std;

int main() 
{
    /*
    
    WE CAN PUSH AND POP IN THIS SAME AS THE STANDARDIZED QUEUE IN DATA STRUCTURE.
    
    WE COULD NOT INITIALIZE IT.WE CAN JUST PUSH ELEMENTS IN IT
    
    */

    std::queue<int>q;
    
    
    q.push(3);
    q.push(4);
    q.push(5);
    
    
    /*
    
    WE COULD GET THE FRONT AND BACK ELEMENT AS WELL AS THE SIZE OF THE QUEUE
    
    cout<<q.front()<<endl;
    
    cout<<q.back()<<endl;
    
    cout<<q.size()<<endl;
    
    */
    
    
    //EMPTY() FUNCTION RETURNS WHETHER THE QUEUE IS EMPTY OR NOT
    
    
    while(!q.empty())
    {
        cout<<q.front()<<" ";
        q.pop();
    }
    return 0;
}
