//Selection Sort in doubly Linked list.


#include<bits/stdc++.h>

using namespace std;
   
struct node{  
    int data;  
    struct node *prev;  
    struct node *next;  
}; 
struct node *head, *tail = NULL;  
   
 
void insert_node(int data)
{  
      
    struct node *newNode = (struct node*)malloc(sizeof(struct node));  
    newNode->data = data;  
      
    if(head == NULL)
    {  
        head = tail = newNode;  
        head->prev = NULL;  
        tail->next = NULL;  
    }  
    else
    {           
        tail->next = newNode;  
        newNode->prev = tail;  
        tail = newNode;  
        tail->next = NULL;  
    }  
}  
   
 
void Selection_sort() 
{  
    struct node *i = NULL, *j = NULL;  
    int temp;  
    
    if(head == NULL) 
    {  
        return;  
    }  
    else 
    {  
        for(i = head; i->next != NULL; i = i->next)
        {  
             for(j = i->next; j != NULL; j = j->next) 
             {  
                if(i->data < j->data)
                {  
                    temp = i->data;  
                    i->data = j->data;  
                    j->data = temp;  
                }  
            }  
        }  
    }  
}  
   
void display() 
{  
    struct node *current = head;  
    if(head == NULL) {  
        printf("List is empty\n");  
        return;  
    }  
    while(current != NULL) {  
        printf("%d ",current->data);  
        current = current->next;  
    }  
    printf("\n");  
}  
   
int main()  
{  
    insert_node(9);  
    insert_node(6);  
    insert_node(8);  
    insert_node(3);  
    insert_node(1);  
      
    printf("Doubly Linked List before Sorting : \n");  
    display();   
    Selection_sort();  
     
    printf("Doubly Linked List after Selection Sort : \n");  
    display();  
   
    return 0;  
}  